import java.util.Scanner; //used to get user input



public class StairCases
{

  /**
 * This class represents a program that 
 * gets an integer input from the user and prints 
 * ascending and descending staircases of 'x' characters, recursively
 * @author Lindsey Yu
 * @version 0.1
 */


  public static void main(String[] args)
  {
     
     /**
      * Main method demonstrates the other two methods by calling each of them.
      * @param args Standard array of commandline String arguments. Not used in this program.
      */
    
    Scanner keyboard = new Scanner(System.in); //set up for user input

    System.out.println("Type in an integer: ");
    int size = keyboard.nextInt();

   

    printAscending(size);
    System.out.println(" ");
    printDescending(size);
  }

/**
       * This method takes in an integer (size) and prints the xs in an ascending fashion
       * @param size the number of stars we want to build up to 
       * no return statement 
       */

  public static void printAscending(int size)

  {  
      if (size > 0)
        printAscending(size-1);
        
      for(int n = 0; n < size; n++) { //set n to 0, till n is higher than count, increment n 
         System.out.print("x"); //just one char (no println) 
         }
  
         System.out.println(" "); 
    
  

   } 

 
 /**
       * This method takes in an integer (size) and prints the xs in a descending fashion
       * @param size the number of stars we want to count down from 
       * no return statement 
       */
  public static void printDescending(int size) //have to use tail recursion 

  {
    

    for (int n = 0; n < size; n++) { //set n to 0, until n is higher than the count, increment
       System.out.print("x");   }

     System.out.println(" ");

     if (size > 0)
        printDescending(size-1);
    }

  }

