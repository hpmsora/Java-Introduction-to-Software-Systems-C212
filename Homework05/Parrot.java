class Parrot extends bird {

  public Parrot() {
    swimBehavior = new DiveNoWay();
    flyBehavior = new Fly();
    speakBehavior = new Speech();
  }
  
  public void display() {
    System.out.println("I'm a parrot");
  }
}