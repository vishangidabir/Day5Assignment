package day5Assignments;
import java.util.Scanner;
public class Primefactor { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any No :");
		int num = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Is a Prime no");

		} else {
			System.out.println("Is a not Prime no");
		}

	}

}
