public class DiagonalStar
{

	public static void main(String[] args)
	{
		printSquareStar(5);
	}

	public static void printSquareStar(int number)
	{
		if (number < 5)
		{
			System.out.println("Invalid Value");
			return ;
		}
		int x = 1;
		int y = 1;
		while (y <= number)
		{
			x = 1;
			while (x <= number)
			{
				if ((y == 1) || y == number || x == 1 || x == number)
					System.out.print("*");
				else if (y == x || (y == (number - x + 1)))
					System.out.print("*");
				else
					System.out.print(" ");
				x++;
			}
			System.out.println("");
			y++;
		}
		return ;
	}
}
