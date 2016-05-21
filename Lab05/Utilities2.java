class Utilities2 {
  public static ListOfFrequency countAllWords(ListOfStrings los) {
    ListOfFrequency lof = new ListOfFrequency();
    for (String word : los)
      Utilities.countWord(lof, word);
    return lof;

  }
  
    public static void main(String[] args) {
    ListOfStrings los = new ListOfStrings(); 
    los.add("mango"); 
    los.add("apple"); 
    los.add("banana"); 
    los.add("mango"); 
    los.add("apple"); 
    los.add("apple"); 
    ListOfFrequency alof = Utilities2.countAllWords(los); 
    System.out.println( alof ); 
  }
}