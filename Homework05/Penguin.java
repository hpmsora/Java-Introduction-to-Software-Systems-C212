class Penguin extends bird {

  public Penguin() {
    swimBehavior = new DeepDive();
    flyBehavior = new FlyNoWay();
    speakBehavior = new SpeakNoWay();
  }
  
  public void display() {
    System.out.println("I'm a penguin");
  }
}