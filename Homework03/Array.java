import java.util.Arrays;
import java.util.Scanner;
  
public class Array{
  
  public static String toString(int[] a){
    String c = "";
    for(int i = 0; i < a.length; i++){
     c += a[i] + ", "; 
    } 
    c = c.substring(0, c.length() - 2); 
    c = "[" + c + "]"; 
    return c; 
  }
  
  public static int[] copyOf(int[] a, int size){ 
    int[]  b = new int[size];
    for(int i = 0; i < a.length; i++){ 
      b[i] = a[i];
    }
    return b;
  }
  
  public static void main(String[] args){
      Scanner in = new Scanner(System.in); 
      int[] a; 
      System.out.print("Enter a number: "); 
      int initial = Integer.parseInt(in.nextLine()); 
      a = new int[] { initial };
      
      do {
        int sum = 0;
        for (int n : a) {
          sum += n;
        }
        int len = a.length;
        double avg = (double) sum / len;
        System.out.print(toString(a) + " Enter a number or bye: "); 
                                                                    
        String line = in.nextLine(); 
        if (line.equals("bye")) { 
          System.out.println(sum + ", " + len + ", " + avg); 
                                                             
          break;
        } 
        int num = Integer.parseInt(line); 
        int[] b = copyOf(a, a.length + 1); 
                                           
        b[b.length - 1] = num; 
        Arrays.sort(b); 
        a = b; 
      } while (true);
  }
  
}