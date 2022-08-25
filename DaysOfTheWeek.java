public class DaysOfTheWeek {
    public static void main(String[] args)
    {

        printDayOftheWeek(0);
        printNumberInWord(-10);
    }

    public static void printNumberInWord(int number)
    {
        String[] numbers= {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        switch(number)
        {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
            System.out.println(numbers[number]);
            break;
            default:
            System.out.println("OTHER");
            break;
        }
    }


	public static void printDayOftheWeek(int day)
	{
        	String days[] ={ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		switch(day)
		{
			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			System.out.println("It is " + days[day]);
			break;
			default:
			System.out.println("Invalid day");
			break;
		}
    	}
}
