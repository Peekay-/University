public class printBox 
{
	public static void print_box()
	{
		int count_1;  /* loop variable for the outer loop */
		int count_2;  /* loop variable for the inner loop */
		for ( count_1 = 0; count_1 < 5; count_1 = count_1 + 1)
		{
			for ( count_2 = 0; count_2 < 5; count_2 = count_2 + 1)
			{
				/* prints the line of stars - Note print, not println */
				System.out.print("*");
			}
			/* prints a end of line character */
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print_box();
	}
} 