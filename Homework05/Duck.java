class Duck extends bird {

  public Duck() {
    swimBehavior = new DiveNoWay();
    flyBehavior = new Fly();
    speakBehavior = new SpeakNoWay();
  }
  
  public void display() {
    System.out.println("I'm a duck");
  }
}