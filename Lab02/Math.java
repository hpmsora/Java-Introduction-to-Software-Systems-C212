import java.util.Scanner;

public class Math {
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("First Number: ");
		int num1 = Integer.parseInt(in.nextLine());
		
		System.out.print("Second Number: ");
		int num2 = Integer.parseInt(in.nextLine());
		
		int numf = max(num1, num2);
		
		System.out.println("max(" + num1 + ", " + num2 +") = " + numf);
		
		System.out.println("The largest number of " + num1 + " and " + num2 + " is: " + numf);
	}

	private static int max(int num1, int num2) {
		if (num1 < num2) {
			return num2;
		} else if (num1 > num2) {
			return num1;
		} else {
			return num1;
		}
	}

}
