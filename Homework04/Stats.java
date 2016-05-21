import java.io.*;
import java.util.*;

public class Stats {
	public static void main(String[] args) throws Exception {
		Scanner a = new Scanner(new File(args[0]));
		int chars = 0, words = 0, lines = 0, nsc = 0;
		for(lines = 0; a.hasNextLine(); lines++) {
			String line = a.nextLine();
			chars += line.length();
			Scanner b = new Scanner(line);
			for (words = 0; b.hasNext(); words++) {
				nsc += b.next().length();
			}
		}
		System.out.println("Number of words/tokens in file: " + words);
		System.out.println("Number of line in files : " + lines);
		System.out.println("Number of characters in files: " + chars);
		System.out.println("Number of non-space characters in files: " + nsc);
		System.out.println("Average word length in file: " + nsc/words);
		System.out.println("Average line length (in words); " + words/lines);
		System.out.println("Average line length (in character): " + chars/lines);
	}
}
