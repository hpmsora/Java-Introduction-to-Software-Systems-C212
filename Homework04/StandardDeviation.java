class StandardDeviation {
	public static void main(String[] args) {
		double sum = 0, sumOfSquares = 0, count = 0;
		for (String arg : args) {
			double n = Double.parseDouble(arg);
			sum += n;
			sumOfSquares += n * n;
			count += 1;
		}
		System.out.print("Standard deviation is: ");
		System.out.println(Math.sqrt( (sumOfSquares - sum * sum /count) / (count - 1)));
	}
}
