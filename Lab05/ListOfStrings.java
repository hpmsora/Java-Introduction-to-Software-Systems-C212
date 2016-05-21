import java.util.*;

class ListOfStrings extends ArrayList<String> {
    public static void main(String[] args) {
     ListOfStrings los = new ListOfStrings(); 
     System.out.println( los );
     los.add("apple"); 
     los.add("banana"); 
     los.add("apple"); 
     los.add("mango"); 
     los.add("banana"); 
     los.add("mango"); 
     los.add("apple"); 
     los.add("apple"); 
     los.add("mango"); 
     System.out.println( los );
  }
}