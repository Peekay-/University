import java.util.Scanner;

public class Assignment3
{
   public static int array[];
   public static int arraySize;

   /***************************** Do not make changes above this line *******************************/
   public static void readDataInToArray()
   {	   
	   for (int index = 0; index < arraySize; index = index + 1)
	   {
		   System.out.print("Enter value for data item " + index + ": ");
		   array[index]=readInt();
	   }
	   System.out.println();
   }



   public static void computeAndDisplayGraph()
   {
      int min = array[0]; 
      int max = array[0];
      int minscore = 0;
      int maxscore = 0;
      
      for (int index = 0; index < arraySize; index = index + 1)
      {
    	if (array[index] > max)  
    	{
    		max = array[index];
    		maxscore = index;
    	}
    	
    	if (array[index] < min)
    	{
    		min = array[index];
    		minscore = index;
    	}
      }
      
      System.out.println("Minimum value is " + min + " and it was (first) found in data item " + minscore);
      System.out.println("Maximum value is " + max + " and it was (first) found in data item " + maxscore);
      System.out.println();
      
      for (int index = 0; index < arraySize; index = index + 1)
      {
    	  int barsize = array[index];
    	  System.out.print(index + ": ");
    	  
    	  for (int starindex = 0; starindex < barsize; starindex = starindex + 1)
    	  {
    		  System.out.print("*");  
    	  }
    	  System.out.println();
      }
      
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
