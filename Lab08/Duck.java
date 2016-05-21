
/**
 * Abstract class Duck - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void display(){}
    
    public void performFly(){
    flyBehavior.fly();
    }
    public void performQuack(){
    quackBehavior.quack();
    }
    
}
