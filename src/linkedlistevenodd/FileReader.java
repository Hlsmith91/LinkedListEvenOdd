/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistevenodd;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Heather
 */

public class FileReader {
    
    public static int numbers;

    public FileReader(){
        
    }
    
     
     public static List<Integer> readFile(String fileName) throws FileNotFoundException{
       ArrayList<Integer> list = new ArrayList<Integer>();
        try{
           Scanner scanner = new Scanner(new File(fileName));
           
            // Check if there is another line of input
            while(scanner.hasNextInt()){
                  list.add(scanner.nextInt());
                }
            scanner.close();
        }
        catch(FileNotFoundException e){
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
      return list;
     }
}
