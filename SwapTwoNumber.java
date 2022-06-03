package day5Assignments;
import java.util.Scanner;
public class SwapTwoNumber { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1 = scanner.nextInt();

		System.out.println("Enter Second Number :");
		int num2 = scanner.nextInt();

		System.out.println("Print Number before swap :" + num1 + " & " + num2);

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("Print Number after swap :" + num1 + "&" + num2);
	}

}
