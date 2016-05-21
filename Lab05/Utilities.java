class Utilities {
  public static void countWord(ListOfFrequency lof, String word) {
    for(Frequency f : lof)
      if (f.word.equals(word)) {
      f.addOne();
      return;
    }
    lof.add(new Frequency (word, 1));
  }
    public static void main(String[] args) {
    ListOfFrequency lof = new ListOfFrequency(); 
    Utilities.countWord( lof, "mango" ); 
    Utilities.countWord( lof, "apple" ); 
    Utilities.countWord( lof, "banana" ); 
    Utilities.countWord( lof, "mango" ); 
    Utilities.countWord( lof, "apple" ); 
    Utilities.countWord( lof, "apple" ); 
    System.out.println( lof ); 
  }
}