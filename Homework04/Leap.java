public class Leap {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		boolean caseOne = (year < 1582) && (year % 4 == 0);
		boolean caseTwo = (year >= 1582) && (year % 4 == 0);
		caseTwo = caseTwo && (year % 100 != 0);
		caseTwo = caseTwo || (year % 400 == 0);
		System.out.println(caseOne || caseTwo);
	}
}
