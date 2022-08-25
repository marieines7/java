//import com.example.FactionNames.Faction;
  //         enum month{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

public class DaysOfTheWeek {
    public static void main(String[] args)
    {

        printDayOftheWeek(0);
        printNumberInWord(-10);
	getDaysInMonth(1, 2222);
    }

/* prints word for numbers */
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

/*prints days of the week */

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






/* gets days in month, leap years included */

public static boolean isLeapYear(int year)
    {
        if (year >= 1 && year <= 9999)
        {
            if ((year % 4 == 0) && (year % 100 != 0))
                return true;
            else if (year % 400 == 0)
                return true;
        }
        return false;
    }
    //This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
  
    public static int getDaysInMonth(int month, int year)
    {
        if (month < 1 || month > 12)
            return -1;
        if (year < 1 || year > 9999)
            return -1;
         
	int days = 0;
        switch(month)
        {
            case 1: case 3 : case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
            {
                if (isLeapYear(year) == true)
                    days = 29;
                if (isLeapYear(year) == false)
                    days = 28;
                break;
            }
            default:
                System.out.println("error");
                break;
            
        }
        System.out.println(days + " days");
	return days;
    }
    
//}
}
