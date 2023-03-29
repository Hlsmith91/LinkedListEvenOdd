/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistevenodd;
import linkedlistevenodd.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author Heather
 */
public class LinkedListEvenOdd   {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
     MyList myList = new MyList();   
     FileReader file = new FileReader();
     List<Integer> results = FileReader.readFile("G:\\DataStructures\\1KInts.txt");
     
     for(int i = 0; i < results.size(); i++){
         myList.AddToEnd(results.get(i));
     }
     //myList.Print();
     System.out.println("Is 3716 present? " + myList.isPresent(3716));
     System.out.println("Is 5 present? " + myList.isPresent(5));
     
     PrintWeirdShit(myList);
     myList.reverse();
     myList.Print();
    }
    
    public static void PrintWeirdShit(MyList list){  
        System.out.println("Overall minimum: "+ list.CalculateMin("overall"));
        System.out.println("Overall maximum: "+ list.CalculateMax("overall"));
        System.out.println("Overall average: "+ list.CalculateAvg("overall"));
        System.out.println("Even minimun: "+ list.CalculateMin("even"));
        System.out.println("Even maximum: "+ list.CalculateMax("even"));
        System.out.println("Even average: "+ list.CalculateAvg("even"));
        System.out.println("Odd minimum: "+ list.CalculateMin("odd"));
        System.out.println("Odd maximum: "+ list.CalculateMax("odd"));
        System.out.println("Odd average: "+ list.CalculateAvg("odd"));
        
        
    }
    
}
