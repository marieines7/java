public class NumberToWords
{
	public static void main(String[] args)
	{
		System.out.println(getDigitCount(0)); //should return 1 since there is only 1 digit
		System.out.println(getDigitCount(123));// should return 3
		System.out.println(getDigitCount(-12));// should return -1 since the parameter is negative
		System.out.println(getDigitCount(5200)); //should return 4 since there are 4 digits in the number
		System.out.println(reverse(-121));
		System.out.println(reverse(1212));
		System.out.println(reverse(1234));
		System.out.println(reverse(100));
		System.out.println("****");
		numberToWords(123); //should print "One Two Three".
		System.out.println("****");
		numberToWords(1010); //should print "One Zero One Zero".
		System.out.println("****");
		numberToWords(1000); //should print "One Zero Zero Zero".
		System.out.println("****");
		numberToWords(-12); //should print "Invalid Value" since the parameter is negative.


	}

	public static int getDigitCount(int number)
	{
		int i = 0;
		if (number < 0)
			return -1;
		if (number == 0)
			return 1;
		while (number > 0)
		{
			i++;
			number /= 10;
		}
		return i;	
	}

	public static int reverse(int number)
	{
		int reverse = 0;
		int isneg = 0;
		int lastdigit = 0;
		if (number < 0)
		{
			isneg = 1;
			number *= -1;
		}
		while (number > 0)
		{
			lastdigit = number % 10;
			reverse = reverse * 10 + lastdigit;
			number /= 10;
		}
		if (isneg == 1)
			reverse *= -1;
		return reverse;
	}
	
	public static void numberToWords(int number)
	{
		int digit = 0;
		String[] digitword = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		if (number < 0)
		{
			System.out.println("Invalid Value");
			return ;
		}
		if (number == 0)
			System.out.println(digitword[digit]);
		int n = reverse(number);
		while (n > 0)
		{
			digit = n % 10;
			System.out.println(digitword[digit]);
			n /= 10;
		}
		int trailingzeros = getDigitCount(number) - getDigitCount(reverse(number));
		for (int i = 0; i < trailingzeros; i++)
			System.out.println(digitword[0]);
	}
}
