# CSE231s__Assignment_6

This program reads an ARXML file containing a list of containers, each with a unique ID, and reorders the containers alphabetically by their name sub-container “"SHORT-NAME" then writes the reordered container to a new ARXML file.
The output file name is the same as the input file name concatenated with “_mod.arxml”
     • e.g. if the input was named “test.arxml” then the output should be “test_mod.arxml”.

To test this project run the batch file which tests 3 cases:
     1. Normal case with sample file.
     2. Non valid case (no arxml extension).
     3. An empty arxml file.

The Output of the batch file sould run normally for the first case and create a new file named "sampleTest_mod.arxml" 
For both the second and third cases it should fail and throw an exception in the terminal. 
     
     
 
