public class printBox_Param
{
	public static void print_box_param(int size)
	{
		int count_1;
		int count_2;
		for ( count_1 = 0; count_1 < size; count_1 = count_1 + 1)
		{
			for ( count_2 = 0; count_2 < size; count_2 = count_2 + 1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		print_box_param(8);
		print_box_param(-1);
	}
}