
public class integercheck 
{
	public static void main(String[] args)
	{
		int a;
		int b;

		ConsoleReader console = new ConsoleReader();

		System.out.print("Person A please enter your age ");
		a = console.readInt();

		System.out.print("Person B please enter your age ");
		b = console.readInt();

		if (a == b)
		{
			System.out.print("Person A and B are the same age");
		}
		else if (a > b)
		{
			System.out.print("Person A is older then Person B");
		}
		else if (b > a)
		{
			System.out.print("Person B is older then person A");
		}
	}


}
