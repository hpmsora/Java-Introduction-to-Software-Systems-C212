public class Money {
	static double start, interest, stipend;
	public static void main(String[] args) {
		start = Double.parseDouble(args[0]);
		interest = Double.parseDouble(args[1]) / 100 / 12;
		stipend = Double.parseDouble(args[2]);
		System.out.println( calculation(start, 0, 0));
	}
	public static String calculation(double balance, int years, int months) {
		if(balance * interest >= stipend)
			return "This lasts forever";
		else if (balance * (1 + interest) < stipend)
			return "This lasts " + years + " year(s) and " + months + " month(s)";
		else {
			if(months == 11) {
				years += 1;
				months = 0;
			} else
				months += 1;
			return calculation(balance * (1 + interest) - stipend, years, months);
		}
	}
}
