public class sum3and5
{
	public static void main(String args[])
	{
		int sum = 0;
		int j = 0;
		for(int i = 1; i < 1001; i++)
		{
			if ((i % 3 == 0) && (i % 5 == 0))
			{
				System.out.println(i);
				sum += i;
				j++;
				if (j == 5)
					break;
			}
		}
	}	
}
