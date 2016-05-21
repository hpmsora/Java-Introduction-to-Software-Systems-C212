import java.util.Scanner;

public class Profiler {
	public static void main(String[] args) {
		System.out.print("Please enter a word or a sentence to profile: ");
		Scanner a = new Scanner(System.in);
		String sentence = a.nextLine(), memory = "";
		for (int i = 0; i < sentence.length(); i++) {
			char b = sentence.charAt(i);
			if(!Profiler.contains(b, memory)) {
				memory += b;
				System.out.println(b + " shows up " + Profiler.count(b, sentence) + "times in the given sentence.");
			}
		}
	}
	static int count(char c, String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			if(s.charAt(i) == c)
				sum += 1;
		return sum;
	}
	static boolean contains(char c, String s) {
		for (int i = 0; i <s.length(); i++)
			if (s.charAt(i) == c)
				return true;
		return false;
	}
}
