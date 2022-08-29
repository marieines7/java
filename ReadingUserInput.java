import java.util.Scanner;

public class ReadingUserInput
{
	public static void main(String[] args)
	{
		int count = 5;
		int i = 0;
		int sum = 0;
		Scanner inputstream = new Scanner(System.in);
		while (i < count)
		{
			System.out.println("Enter number # " + i);
			if (inputstream.hasNextInt())
			{
				int number = inputstream.nextInt();
				System.out.println(number);
				sum += number;
				System.out.println("sum = " + sum);
				++i;
			}
			else
				System.out.println("Enter a valid number");
			inputstream.nextLine();
		}
		inputstream.close();
/*
	boolean hasNextint = scqnner.hasNextInt(); //checks to see if next input is an int
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number #" + i);
			String name = scanner.nextLine();
			System.out.println("Enter number #");
			int year = scanner.nextInt();
			scanner.nextLine();
			scanner.close();
*/	}
}
