import java.util.Scanner;

public class Assignment3
{
   public static int array[];
   public static int arraySize;

   /***************************** Do not make changes above this line *******************************/
   public static void readDataInToArray()
   {
      /* Add your code here */
   }



   public static void computeAndDisplayGraph()
   {
      /* Add your code here */
   }
   /***************************** Do not make changes below this line *******************************/


   public static int readInt()
   {
      Scanner reader=new Scanner(System.in);
      return reader.nextInt();
   }

   public static void main(String args[])
   {
      System.out.print("Enter number of data items to graph: ");
      arraySize=readInt();  // Use this "plain" readInt() instead of ConsoleReader's readInt() method.
      array=new int[arraySize];
      System.out.println();

      readDataInToArray();
      computeAndDisplayGraph();

   }

}
