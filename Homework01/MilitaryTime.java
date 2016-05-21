import java.util.Scanner; 

public class MilitaryTime {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the first time: ");
		String st1 = in.nextLine();
		
		System.out.print("Pleas enter the second time: ");
		String st2 = in.nextLine();
		
		int t11 = Integer.parseInt(st1.substring(0, 2));
		int t12 = Integer.parseInt(st1.substring(3, 5));
		int ft1 = t11 * 60 + t12;
		
		int t21 = Integer.parseInt(st2.substring(0, 2));
		int t22 = Integer.parseInt(st2.substring(3, 5));
		int ft2 = t21 * 60 + t22;
		
		int ft = (ft2 - ft1 + 60 * 24) % (60 * 24);
		
		System.out.println((ft / 60) + " hours and " + (ft % 60) + " minutes.");
	}

}
