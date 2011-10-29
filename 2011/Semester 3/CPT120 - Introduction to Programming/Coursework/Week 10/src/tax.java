public class tax
{
	public static void main(String[] args)
	{
		int taxableincome;
		ConsoleReader console = new ConsoleReader();
		System.out.print("Please enter your earnings : ");
		taxableincome = console.readInt();
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
}