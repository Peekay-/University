public class Judgescore2 
{
	public static void main(String[] Args)
	{
		int Contestant[];
		Contestant = new int[10];

		int total;
		int index;
		int average;
		int min;
		int max;
		int mincont;
		int maxcont;

		Contestant[0] = 2;
		Contestant[1] = 1;
		Contestant[2] = 7;
		Contestant[3] = 5;
		Contestant[4] = 7;
		Contestant[5] = 4;
		Contestant[6] = 3;
		Contestant[7] = 1;
		Contestant[8] = 2;
		Contestant[9] = 6;

		total = 0;
		min = 11;
		max = -1;
		maxcont = 0;
		mincont = 0;

		for (index = 0; index < 10; index = index + 1)
		{
			total = total + Contestant[index];
		}

		average = (total / 10);

		for (index = 0; index < 10; index = index + 1)
		{
			System.out.print("Contestant " + (index + 1) + " rated " + Contestant[index] + " out of 10, they were");

			if (Contestant[index] > average)
			{
				System.out.println(" above average");
			}
			else if (Contestant[index] < average)
			{
				System.out.println(" below average");
			}
			else if (Contestant[index] == average)
			{
				System.out.println(" on the average");
			}
		}

		for (index = 0; index < 10; index = index + 1)
		{
			if (Contestant[index] < min)
			{
				min = Contestant[index];
				mincont = index + 1;
			}
			if (Contestant[index] > max)
			{
				max = Contestant[index];
				maxcont = index + 1;
			}
		}

		System.out.println("The lowest rating contestant was contestant " + mincont + " and the highest rating contestant was contestant " + maxcont);
	}
}
