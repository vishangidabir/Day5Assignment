package day5Assignments;
import java.util.Scanner;
public class LargeNumOfThree { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1 = scanner.nextInt();

		System.out.println("Enter Second Number :");
		int num2 = scanner.nextInt();

		System.out.println("Enter Third Number :");
		int num3 = scanner.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is greater Number:");
		} else if (num2 > num3) {
			System.out.println(num2 + " is greater Number:");
		} else {
			System.out.println(num3 + " is greater Number:");
		}
	}

}
