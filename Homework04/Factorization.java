import java.util.*;

class Factorization {
	public static void main(String[] args) {
		ArrayList<Integer> factorization = new ArrayList<Integer>();
		for(int n = Integer.parseInt(args[0]), f=2; n>1;) {
			if(n%f == 0) {
				n /= f;
				factorization.add(f);
			} else
				f+= 1;
		}
		System.out.println(factorization);
	}
}
