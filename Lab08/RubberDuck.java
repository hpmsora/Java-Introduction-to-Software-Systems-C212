
/**
 * Write a description of class RubberDuck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RubberDuck extends Duck
{
  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }
    public void display() {
    System.out.println("I'm a rubber duck");
  }
}
