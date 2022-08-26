public class LastDigitChecker {

	public static void main(String[] args)
	{
		System.out.println(hasSameLastDigit (41, 22, 71)); //→ should return true since 1 is the rightmost digit in numbers 41 and 71
		System.out.println(hasSameLastDigit (23, 32, 42)); //→ should return true since 2 is the rightmost digit in numbers 32 and 42
		System.out.println(hasSameLastDigit (1000, 1001, 1000)); //→ should return true since 2 is the rightmost digit in numbers 32 and 42
	}

	public static boolean isValid(int x)
	{
		if (x >= 10 && x <= 1000)
			return true;
		return false;
	}

	public static boolean hasSameLastDigit (int x, int y, int z)
	{
		if (isValid(x) && isValid(y) && isValid(z))
			if ((x % 10 == y % 10) || (y % 10 == z % 10) || (x % 10 == z % 10))
				return true;
		return false; 
	}

}
