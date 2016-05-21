import java.util.Scanner;

public class Leap {
	
	public static void main (String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		boolean result = true;
		
		System.out.print("Enter year: ");
		int year = Integer.parseInt(in.nextLine());
		
		if (year > 1582) {
			if ((year % 400) == 0) {
				result = true;
			}
			else if ((year % 100) == 0) {
				result = false;
			}
			else if ((year % 4) == 0) {
				result = true;
			}
			else {
				result = false;
			}
		} else {
			result = true;
		}
		System.out.println(result);
	}

}
