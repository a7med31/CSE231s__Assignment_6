package Lab6_Code;

public class Containers  implements Comparable<Containers> {

    private String id;
    private String shortName;
    private String longName;
    private String container;
    
    public Containers(String container){
        this.container=container;
        this.shortName=container.substring(container.indexOf("<SHORT-NAME>") + 12, container.indexOf("</SHORT-NAME>"));
        this.longName=container.substring(container.indexOf("<LONG-NAME>") + 11, container.indexOf("</LONG-NAME>"));
        this.id=container.substring(container.indexOf("UUID=") + 6, container.indexOf("\">"));
        
    }
    
    public void setid(String id){
        this.id=id;
    }
    
    public void setshortName(String n){
        this.shortName=n;
    }
    
      public void setlongtName(String n){
        this.longName=n;
    }
      
      public String getid(){
          return this.id;
      }
      public String getshortName(){
          return this.shortName;
      }
      
      public String getlongName(){
          return this.longName;
      }
      
    @Override
      public String toString(){
          return container ;
      }
    
    @Override
    public int compareTo(Containers containers){
        return this.shortName.compareTo(containers.getshortName());
     
    }
}
