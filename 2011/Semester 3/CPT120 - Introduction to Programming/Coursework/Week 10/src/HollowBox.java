
public class HollowBox
{
	public static void print_box_param_get_size(int size)
	{
		int count_1;
		int count_2;
		for ( count_1 = 1; count_1 <= size; count_1 = count_1 + 1)
		{
			for ( count_2 = 1; count_2 <= size; count_2 = count_2 + 1)
			{
				if(count_1 == 1 || count_1 == size || count_2 == 1 || count_2 == size)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		int boxSize;
		ConsoleReader console = new ConsoleReader();

		System.out.print("Input the size of box you wish to print : ");
		boxSize = console.readInt();
		print_box_param_get_size(boxSize);
	}
}
