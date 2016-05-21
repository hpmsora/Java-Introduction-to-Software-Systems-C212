
/**
 * Write a description of class MallardDuck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MallardDuck extends Duck
{
  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
  public void display() {
    System.out.println("I'm a real Mallard duck");
}
}
