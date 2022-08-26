public class SharedDigit
{
	public static void main(String[] args)
	{
		System.out.println(hasSharedDigit(12, 23)); // → should return true since the digit 2 appears in both numbers
		System.out.println(hasSharedDigit(9, 99)); //→ should return false since 9 is not within the range of 10-99
		System.out.println(hasSharedDigit(15, 55)); //→ should return true since the digit 5 appears in both numbers
	}
	

	public static boolean hasSharedDigit(int x, int y)
	{
		if (!(x >= 10 && x <= 99))
			return false;
		if (!(y >= 10 && y <= 99))
			return false;
		int digitx = 0;
		int digity = 0;
		int ybis = y;
		//s'il n'y avait pas eu le range avec la mm longueur pour x et y il aurait fallu que je pense a math.log && à accorder à x la valeur la plus 'longue'
		while (x > 0)
		{
			digitx = x % 10;
			y = ybis;
			while (y > 0)
			{
				digity = y % 10;
				if (digitx == digity)
					return true;
				y /= 10;
			}
			x /= 10;
		}
		return false;
	}
}
