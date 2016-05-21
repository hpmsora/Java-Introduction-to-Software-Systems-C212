import java.util.*;

public class Dialogue {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What's your name?  ");
		String name = scan.nextLine();
		System.out.print("How old are you " + name + "?  ");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println(name + " you will be " + (age + 1) + " next year.");
	}
}