public class FirstLastDigitSum
{
	public static void main(String[] args)
	{
		System.out.println(sumFirstAndLastDigit(242));
		System.out.println(sumFirstAndLastDigit(241));
		System.out.println(sumFirstAndLastDigit(0));
	}

	public static int sumFirstAndLastDigit(int number)
	{
		int sum = 0;
		if (number < 0)
			return -1;
		if (number == 0)
			return 0;
		int length = (int) (Math.log10(number));
		int lastdigit = number % 10;
		int firstdigit = number / (int)Math.pow(10, length);
		System.out.println(number + " lastdigit : " + lastdigit + " firstdigit " + firstdigit);
		sum = lastdigit + firstdigit;
		return sum;
	}		
}
