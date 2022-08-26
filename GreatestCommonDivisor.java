public class GreatestCommonDivisor
{
	public static void main(String[] args)
	{
		System.out.println(getGreatestCommonDivisor(25, 15));// should return 5 since both can be divided by 5 without a remainder
		System.out.println(getGreatestCommonDivisor(12, 30)); //should return 6 since both can be divided by 6 without a remainder
		System.out.println(getGreatestCommonDivisor(9, 18)); //should return -1 since the first parameter is < 10
		System.out.println(getGreatestCommonDivisor(81, 153)); //should return 9 since both can be divided by 9 without a remainder
	}

	public static int getGreatestCommonDivisor(int first, int second)
	{
		if (first < 10 || second < 10)
			return -1;
		int i = 0;
		int divisor = 0;
		int greatestdivisor = 1;
		while (++i < first)
		{
			if (first % i == 0)
				divisor = i;
			if (second % divisor == 0)
				greatestdivisor = divisor;
		}
		return greatestdivisor;
	}
}
