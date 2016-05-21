public class Convert {
	public static void main(String[] args) {
		String[] letters = {"F", "D-", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
		double[] values = {0, 1-0.3, 1, 1+0.3, 2-0.3, 2, 2+0.3, 3-0.3, 3, 3+0.3, 4-0.3, 4};
		System.out.print("Enter value please: ");
		double value = (new java.util.Scanner(System.in)).nextDouble();
		if (0<=value && value<=4) {
			for(int i = letters.length - 1; i >0; i = i + 1) 
				if(value >= (values[i] + values[i-1]) /2) {
					System.out.println(letters[i]);
					return;
				}
				System.out.println("F");
			} else if (value > 4 || value < 0)
				System.out.println("Invalid input");
		
	}
}
