
public class StudentGrade
{
	public static int Get_ValidNumber(int minimum, int maximum)
	{
		int index = 0;
		int number[] = new int [10];
		minimum = -1;
		maximum = 101;	  

		ConsoleReader console = new ConsoleReader();

		for (index = 0; index < number.length; index = index + 1)
		{
			System.out.println("Input the students result : ");
			number[index] = console.readInt();
			if ( number[index] < minimum || number[index] > maximum)
			{
				System.out.println("That result is not in the valid range");
				System.out.println("Please re-enter the student's result : ");
				number[index] = console.readInt();
			}
		}

		return (number[index]);
	}
	public static void main(String[] args)
	{
		int result;

		result = Get_ValidNumber(0, 100);
		System.out.println("The students result you entered was " + result);
		System.out.print("This corresponds to a grade of ");
		if((result <= 100) && (result >= 80))
		{
			System.out.println("High Distinction");
		}
		else if((result < 80) && (result >= 70))
		{
			System.out.println("Distinction");
		}
		else if((result < 70) && (result >= 60))
		{
			System.out.println("Credit");
		}
		else if((result < 60) && (result >= 50))
		{
			System.out.println("Pass");
		}
		else if((result < 50) && (result >= 0))
		{
			System.out.println("Fail");
		}
	}
}
