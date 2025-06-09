package addon;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2024; // Example year
		boolean isLeapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true; 
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true; 
			}
		} else {
			isLeapYear = false; 
		}

		if (isLeapYear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

}
