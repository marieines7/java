public class isPalindrome
{
	public static void main(String arg[])
	{
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}

	public static boolean isPalindrome(int number)
	{
		int isneg = 0;
		int lastdigit = 0;
		int reversed = 0;
		int n = number;
		if (number < 0)
		{
			isneg = 1;
			number *= -1;
		}
		while (number > 0)
		{
			lastdigit = number % 10;
			reversed = reversed * 10 + lastdigit;
			number /= 10; 
		}
		if (isneg == 1)
			n *= -1;
		if (reversed == n)
			return true;
		else
			return false;
	}
}
