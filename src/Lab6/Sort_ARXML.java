package Lab6;

import java.io.*;
import java.util.*;

public class Sort_ARXML {
    public static void main(String[] args) {
   
       
        try{
        String fileName = args[0];
        if(!fileName.endsWith(".arxml"))
           throw new NotVaildAutosarFileException("Invalid: the file doesn't have .arxml extension");
       
        File file = new File(fileName);
        BufferedReader r = new  BufferedReader(new FileReader(file));
             
        StringBuilder data = new StringBuilder();
        String str;
       
        if(r.readLine() == null){
            throw new EmptyAutosarFileException("Invalid: the file entered is empty");
        }
             
        while((str= r.readLine())!= null){
                data.append(str);
                data.append("\n");
             }
           
        ArrayList<Containers> containers = new ArrayList<>();
    
        int  i=0;
        while (data.indexOf("<CONTAINER", i)!=-1){
          
           containers.add(new Containers(data.substring( i=data.indexOf("<CONTAINER",i), data.indexOf("</CONTAINER>",i)+12)));
           i=data.indexOf("<CONTAINER", i)+1;  
         
       }
       Collections.sort(containers);
 
        String outputFileName= fileName.substring(0,fileName.indexOf("."))+ "_mod.arxml";
        File outputFile = new File(outputFileName);
            try(BufferedWriter output = new BufferedWriter(new FileWriter(outputFile))){
                output.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<AUTOSAR>\n");
                for(int n=0;n<containers.size();n++){
                    output.write((containers.get(n)).toString());
                    output.newLine();
                }
                output.write("</AUTOSAR>");
                output.close();
             
             }
        }
   
     catch (NotVaildAutosarFileException e) {
                System.out.println(e.getMessage()); 
            } catch (FileNotFoundException e){
                System.out.println(e.getMessage()); 
            } catch (EmptyAutosarFileException e){
                System.out.println(e.getMessage()); 
            } 
            catch (IOException e){
                System.out.println(e.getMessage()); 
            }
} 
}

