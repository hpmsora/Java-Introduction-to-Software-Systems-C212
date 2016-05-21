
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String[] args) {
    MallardDuck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.swim();
    mallard.display();
    mallard.performFly();
    
    RubberDuck rubberDuckie = new RubberDuck();
    rubberDuckie.performQuack();
    rubberDuckie.swim();
    rubberDuckie.display();
    rubberDuckie.performFly();
    
    DecoyDuck decoy = new DecoyDuck();
    decoy.performQuack();
    decoy.swim();
    decoy.display();
    decoy.performFly();
  }
}
