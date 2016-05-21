import java.util.*;

class ListOfFrequency extends ArrayList<Frequency> {
    public static void main(String[] args) {
    ListOfFrequency lof = new ListOfFrequency(); 
    System.out.println( lof ); 
    lof.add(new Frequency("pear", 2));
    lof.add(new Frequency("guava", 3));
    lof.add(new Frequency("orange", 1));
    System.out.println( lof ); 
  }
}