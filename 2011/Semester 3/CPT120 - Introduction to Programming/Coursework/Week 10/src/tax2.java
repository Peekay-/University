public class tax2
{
	public static void tax_check ()
	{
		ConsoleReader console = new ConsoleReader();
		
		System.out.print("Please enter your earnings : ");
		int taxableincome = console.readInt();
		
		System.out.println("Your income was : " + taxableincome);
		
		if ((taxableincome <= 6000))
		{
			System.out.println("You pay no tax");
		}
		else if ((taxableincome >= 6001))
		{	
			System.out.print("You pay tax on "); 
			System.out.print(taxableincome - 6000);
		}	
	}

	public static void main(String[] args)
	{
		int agecheck;
		
		ConsoleReader console = new ConsoleReader();
		
		System.out.print("Please enter your age : ");
		agecheck = console.readInt();
		
		if ((agecheck > 17 && agecheck < 66))
		{ 
			tax_check();
		}
		else
		{
			System.out.println("This tax application is only for users aged between 18 and 65");
		}

	}
}