import java.util.Scanner;

public class MinAndMaxInput
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int number = 0;
		while(true)
		{
			System.out.println("Enter number:");
			if (in.hasNextInt())
			{
				number = in.nextInt();
				if (number > max)
					max = number;
				if (number < min)
					min = number;
				System.out.println("Entered " + number);
			}
			else
			{
				System.out.println("End. Min = " + min + " Max = " + max);
				break;
			}
			in.nextLine();
		}
		in.close();
	}
}

