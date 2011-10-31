public class JavaArray
{
	public static void main(String[] args)
	{
		int numGroup[];        /* define the array type and name */
		numGroup = new int[3]; /* define the number of elements in the array */
		int total;
		int index;

		numGroup[0] = 10;
		numGroup[1] = 20;
		numGroup[2] = 30;
		total = 0;  /* total is set to a known start value, because we are adding to it within the loop */ 
		for ( index = 0; index < 3; index = index + 1 ) 
		{
			total = total + numGroup[index]; /* using the loop counter to access each element within the array */
		}
		System.out.println("The total of the numbers in numGroup array is " + total);
	}
}