package day5Assignments;

public class PowerOfTwo { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2, exponent = 1;
		for (int i = 1; exponent <= 31; i++) {
			double power = Math.pow(base, exponent);
			System.out.println("Result untill 2^31:--->" + power);
		}
	}

}
