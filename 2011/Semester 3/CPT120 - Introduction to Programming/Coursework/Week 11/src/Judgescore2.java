public class Judgescore2 
{
	public static void main(String[] Args)
	{
		int Contestant[] = new int[10];

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

		score(Contestant);
	}

	private static void score(int[] Contestant) 
	{
		int total = 0;
		int min = 11;
		int max = -1;
		int maxcont = 0;
		int mincont = 0;

		for (int index = 0; index < Contestant.length; index = index + 1)
		{
			total = total + Contestant[index];
		}

		int average = (total / Contestant.length);

		for (int index = 0; index < Contestant.length; index = index + 1)
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
