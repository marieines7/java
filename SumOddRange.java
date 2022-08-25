public class SumOddRange
{
	public static void main(String[] args)
	{
		System.out.println("sum = " + sumOdd(-10, 10));
	}

	public static boolean isOdd(int number)
	{
		if (number > 0)
			if ((number % 2) == 1)
				return true;
		return false;
	}

	public static int sumOdd(int start, int end)
	{
		if (!(end >= start && start > 0 && end > 0))
			return -1;
		int sum = 0;
		for (int i = start; i <= end; i++)
		{
			if (isOdd(i))
			{
				System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}
}
