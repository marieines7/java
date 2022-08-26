public class SumOddRange
{
	public static void main(String[] args)
	{
//		if (isEven(8))
//			System.out.println("isEven : 8");
		int n = 0;
		int total = 0;
		while(n <= 10)
		{
			n++;
			if (isEven(n))
				total++;
			if (total == 5)
				break;
		}
		System.out.println("total even " + total);
		//System.out.println("sum = " + sumOdd(-10, 10));
	}

	public static boolean isOdd(int number)
	{
		if (number > 0)
			if ((number % 2) == 1)
				return true;
		return false;
	}

	public static boolean isEven(int number)
	{
		if (number % 2 == 0)
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
