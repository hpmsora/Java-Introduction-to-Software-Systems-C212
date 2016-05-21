class Buffon {
	public static void main(String[] args) {
		Needle n = new Needle();
		int tries = Integer.parseInt(args[0]);
		for (int i = 0; i < tries; i++) {
			n.drop();
		}
		System.out.println((double) n.tries/n.hits);
	}
}

class Needle {
	int hits, tries;
	void drop() {
		double angle = Math.random() * Math.PI;
		double y = Math.random() * 2;
		double span = Math.sin(angle) + y;
		if (y == 0 || span >= 2)
			this.hits += 1;
		this.tries += 1;
	}
}
