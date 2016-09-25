import java.util.Scanner; //used to get user input



public class StairCases
{

  /**
 * This class represents a program that 
 * gets an integer input from the user and prints 
 * ascending and descending staircases of 'x' characters
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
    printDescending(size);
  }


  public static void printAscending(int size)

  {  
       /**
       * This method takes in an integer (size) and prints the stars in an ascending fashion
       * @param size the number of stars we want to build up to 
       * no return statement 
       */

   
    int count = 0;
    
    for (int i = 0; i < size; i++ ){
      count = count + 1;

      for(int n = 0; n < count; n++) {
         System.out.print("x");
      }

      System.out.println(" ");
    
     }
     System.out.println(" ");

     
  }


  public static void printDescending(int size)

  {

     /**
       * This method takes in an integer (size) and prints the xs in a descending fashion
       * @param size the number of stars we want to count down from 
       * no return statement 
       */

    int count = (size + 1);

    for (int i = 0; i < size; i++) {
      
        count = count-1;
      
        for (int n = 0; n <count; n++) {
          System.out.print("x");
        }

        System.out.println(" ");
    }

  }
}
