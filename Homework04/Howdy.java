public class Howdy {
	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		System.out.println(name + " you will be" + (age + 1) + "next year!");
	}
}