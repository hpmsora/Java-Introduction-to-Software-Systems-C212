import java.util.*;

class Example {
  public static void main(String[] args) {
    while(true) {
      System.out.print("Please enter an integer: ");
      Scanner a = new Scanner(System.in);
      String n = a.nextLine();
      try {
        int number = Integer.parseInt(n);
        System.out.println("You have entered " + number + " with square root " + Math.sqrt(number));
        break;
      } catch (Exception e) {
        System.out.println("Sorry " + n + " in not an integer.");
      }
    }
  }
}