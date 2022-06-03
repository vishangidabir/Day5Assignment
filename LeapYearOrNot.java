package day5Assignments;
import java.util.Scanner;
public class LeapYearOrNot { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = scanner.nextInt();

		if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
			System.out.println(year + " is leap ");

		} else {
			System.out.println(year + " is not a leap ");
		}
	}

}
