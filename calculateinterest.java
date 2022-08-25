public class calculateinterest
{


	public static void main(String [] args)
	{
		for (int i = 2; i < 9; i++)
			System.out.println(calculateInterest(10000, i));
	// nota bene : String.format(".2f", lechiffre); pour sortir un chiffre au format 2 decimals

		//same thing but start from 8% and work back to 2%
		for (int i = 8; i > 1; i--)
			System.out.println(calculateInterest(10000, i));
			//System.out.println(String.format(.2f, calculateInterest(10000, i)));
		

		int nprimes = 0;
		for (int i = 0; i < 20; i++)
		{
			if (isPrime(i))
			{
				nprimes++;
				System.out.println(i + "is prime");
		//		i =+ nprimes;
				if (nprimes == 3)
				{
					System.out.println("done");
					break;
				}

			}
		}
	}

	public static double calculateInterest(double amount, double interestRate)
	{
		return (amount * (interestRate / 100));
	}

	public static boolean isPrime(int n)
	{
		if (n == 1)
			return false;
		for (int i = 2; i <= (n / 2); i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

	
}
