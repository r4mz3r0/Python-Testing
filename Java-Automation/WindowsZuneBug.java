import java.util.Calendar;
import java.util.Scanner; 

public class zuneBug {
	int year = 1980; 
	public static boolean isLeapYear(int year) {
		Calendar cal = Calendar.getInstance(); 
		cal.set(Calendar.YEAR, year);
		return(cal.getActualMaximum(Calendar.DAY_OF_YEAR)> 365 ); 
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year"); 
		int year = input.nextInt(); 
		input.close();
		int days = 365; 
		if(isLeapYear(year)) {
			days = 366; 
		}
		while(days > 365) {
			if(isLeapYear(year)) {
				if(days > 366) {
					days -= 366; 
					year++;
				}else {
					days -= 365;
					year++;
				}
			}
		}
	}

}
