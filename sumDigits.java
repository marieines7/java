public class sumDigits
{
	public static void main(String [] args)
	{
		System.out.println(sum(-53));
	}

	public static int sum(int n)
	{
		int isneg = 0;
		int digit = 0;
		int total = 0;
		if (n < 0)
		{
			isneg = 1;
			n = n * -1;
		}
		while (n > 0)
		{
			digit = n % 10;
			total += digit;
			n = n / 10;
		}
		if (isneg == 1)
			total = total * -1;
		return total;
	}
}
