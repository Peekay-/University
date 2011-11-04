
public class StudentGrade
{
	public static int Get_ValidNumber()
	{
		int number = 0;
		int minimum = 0;
		int maximum = 100;	  

		ConsoleReader console = new ConsoleReader();

		System.out.print("Input the students result : ");
		number = console.readInt();
		if ( number < minimum || number > maximum)
		{
			System.out.println("That result is not in the valid range");
			System.out.print("Please re-enter the student's result : ");
			number = console.readInt();
		}


		return (number);
	}
	public static void main(String[] args)
	{
		int count = 0;
		int result[] = new int [10];

		for (count = 0; count < result.length; count = count + 1)
		{
			result[count] = Get_ValidNumber();
		}

		for (count = 0; count < result.length; count = count + 1)
		{
			System.out.print ("Student number " + (count + 1) + " recieved a result of " + result[count] + " this is a ");

			if((result[count] <= 100) && (result[count] >= 80))
			{
				System.out.println("High Distinction");
			}
			else if((result[count] < 80) && (result[count] >= 70))
			{
				System.out.println("Distinction");
			}
			else if((result[count] < 70) && (result[count] >= 60))
			{
				System.out.println("Credit");
			}
			else if((result[count] < 60) && (result[count] >= 50))
			{
				System.out.println("Pass");
			}
			else if((result[count] < 50) && (result[count] >= 0))
			{
				System.out.println("Fail");
			}

		}

	}
}
