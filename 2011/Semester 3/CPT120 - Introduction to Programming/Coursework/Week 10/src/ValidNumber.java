public class ValidNumber
{
	public static int Get_ValidNumber(int minimum, int maximum)
	{
		int number;
		ConsoleReader console = new ConsoleReader();

		/* we need to set number to a value that will be true for the loop test */
		/* in this case minimum - 1 is less than minimum and gives us a true from the test */
		number = minimum - 1;
		while ( number < minimum || number > maximum)
		{
			System.out.print("Input the students result : ");
			number = console.readInt();
			if( number < minimum || number > maximum)
			{
				System.out.println("That result is not in the valid range");
			}
		}
		return(number);
	}

	public static void main(String[] args)
	{
		int result;

		result = Get_ValidNumber(0, 100);
		System.out.println("The students result you entered was " + result);
	}
}