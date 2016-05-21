public abstract class bird {
  
  FlyBehavior flyBehavior;
  SwimBehavior swimBehavior;
  SpeakBehavior speakBehavior;
  
  public abstract void display();
  
  public void performFly() {
    flyBehavior.fly();
  }
  
  public void performSwim() {
    swimBehavior.swim();
  }
 
  public void performSpeak() {
    speakBehavior.speak();
  }
}
