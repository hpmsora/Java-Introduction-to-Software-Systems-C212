import java.util.*;

class Six_2 {
  public static void main(String[] args) {
    ArrayList<Fruit> a = new ArrayList<Fruit>();
    a.add(new Apple());
    a.add(new Mango());
    a.add(new Orange());
    a.add(new Apple());
    a.add(new Orange());
    a.add(new Apple());
    a.add(new Mango());
    System.out.println(a);
    Collections.sort(a);
    System.out.println(a);
  }
}

class Fruit implements Comparable<Fruit> {
  public int compareTo (Fruit other) {
    if (this instanceof Mango && other instanceof Mango) return 0;
    else if (this instanceof Mango && other instanceof Mango) return 0;
    else if (this instanceof Mango && other instanceof Apple) return 0;
    else if (this instanceof Mango && other instanceof Orange) return 0;
    else if (this instanceof Orange && other instanceof Mango) return 0;
    else if (this instanceof Orange && other instanceof Apple) return 0;
    else if (this instanceof Orange && other instanceof Orange) return 0;
    else if (this instanceof Apple && other instanceof Mango) return 0;
    else if (this instanceof Apple && other instanceof Apple) return 0;
    else return 1;
  }
}

class Apple extends Fruit {}

class Mango extends Fruit {}

class Orange extends Fruit {}