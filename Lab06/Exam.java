import java.util.*;

public class Exam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String var = "";
		System.out.print("Enter Number: ");
		var = scan.nextLine();
		int count = 1;
		double num = 0;
		double max = 0;
		double total = 0;
		double min = 0;
		double average = 0;
		double range = 0;
		
		if(!(var.equals("Done"))) {
			num = Double.parseDouble(var);
			max = num;
			min = num;
			average = num;
		}
		while (!(var.equals("Done"))) {
			num = Double.parseDouble(var);
			total += num;
			if(num > max)
				max = num;
			if(num < min)
				min = num;
			average = total/count;
			range = max - min;
			System.out.println("Max: " + max + ", min: " + min + ", average: " + average + ", range: " + range);
			System.out.print("Enter number: ");
			var = scan.nextLine();
			count++;
		}
		if(count != 1) {
			System.out.println("Thanks, bye now");
			System.out.println("Max: " + max + ", min: " + min + ", average: " + average + ", range: " + range);
		}
		else
			System.out.println("Thanks, bye now. No Data entered.");
		
	}

}
