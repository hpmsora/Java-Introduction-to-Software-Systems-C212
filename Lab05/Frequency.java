class Frequency {
  String word;
  Integer count;
  Frequency(String word, Integer count) {
    this.word = word;
    this.count = count;
  }
  void addOne() {
    this.count += 1;
  }
    public String toString() {
      return "(" + word + ", " + count + ")";
    }
    public static void main(String[] args) {
    Frequency f = new Frequency("mango", 2); 
    System.out.println( f ); 
    f.addOne();
    System.out.println( f ); 
  }
  }