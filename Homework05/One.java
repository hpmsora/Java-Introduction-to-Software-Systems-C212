import javax.swing.*; 
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class One extends JFrame {
  One() {
    Two b = new Two();
    Container c = this.getContentPane(); 
    c.add(b); 
    this.setVisible(true); 
    this.setSize(400, 400); 
    this.setDefaultCloseOperation( 3 ); 
  } 
  public static void main(String[] args) {
    One a = new One();
  } 
}

class Two extends JComponent implements MouseMotionListener, MouseListener {
  Circle eye_1, eye_2;
  Line line_1, line_2;
  Curve mouth;
  Two() {
    this.eye_1 = new Circle( new Point(150, 100), 20 );
    this.eye_2 = new Circle( new Point(250, 100), 20 );
    this.mouth = new Curve( new Point(120, 100), 160, 200, 180, 180);
    this.addMouseMotionListener(this);
    this.addMouseListener(this);
  } 
  public void mouseMoved(MouseEvent e) {
    int x = e.getX(), y = e.getY(); 
    System.out.println( "(" + x + ", " + y + ")" ); 
    this.line_1 = new Line( this.eye_1.center, new Point( x, y ) );
    this.line_2 = new Line( this.eye_2.center, new Point( x, y ) );
    this.mouth = new Curve( new Point(135, 150), 125, 140, 180, 180);
    this.repaint(); 
  }
  public void mouseDragged(MouseEvent e) {
    System.out.println("Mouse dragged..."); 
  }
  public void paintComponent(Graphics g) {
    this.eye_1.draw(g);
    this.eye_2.draw(g);
    g.drawOval(160, 150, 80, 30);
    this.mouth.draw(g);
    if ((line_1 != null)||(line_2 != null)) {
      this.line_1.drawPupil(g, this.eye_1.radius - 5);
      this.line_2.drawPupil(g, this.eye_2.radius - 5);
    }
  }
  public void  mouseClicked(MouseEvent e) {}
  public void  mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {
    this.mouth = new Curve( new Point(120, 100), 160, 200, 180, 180);
    this.repaint();
  }
  public void  mousePressed(MouseEvent e) {}
  public void  mouseReleased(MouseEvent e) {}
}

class Circle {
  Point center;
  int radius;
  Circle(Point c, int r) {
    this.center = c;
    this.radius = r; 
  }  
  void draw(Graphics g) {
    g.drawOval(this.center.x - this.radius, 
               this.center.y - this.radius, 
               this.radius * 2, 
               this.radius * 2); 
  }
}

class Curve {
  Point center;
  int width, height, st_ang, en_ang;
  Curve(Point p, int a, int b, int c, int d) {
    this.center = p;
    this.width = a;
    this.height = b;
    this.st_ang = c;
    this.en_ang = d;
  }
  void draw(Graphics g) {
    g.drawArc(this.center.x, this.center.y,
              this.width, this.height, this.st_ang, this.en_ang);
  }
}

class Point {
  int x, y;
  Point(int x, int y) {
    this.x = x; 
    this.y = y; 
  }
  double distanceTo(Point another) {
    int dx = this.x - another.x; 
    int dy = this.y - another.y; 
    return Math.sqrt( dx * dx + dy * dy );
  }
}

class Line {
  Point a, b; 
  Line(Point a, Point b) {
    this.a = a; 
    this.b = b; 
  }
  double length() {
   return this.a.distanceTo(this.b); 
  }
  void drawPupil(Graphics g, int r) {
    int x, y;
    double t = (double) r / this.length();  
    x = (int) (a.x + t * (b.x - a.x)); 
    y = (int) (a.y + t * (b.y - a.y)); 
    g.setColor(Color.BLACK); 
    g.fillOval( x-6, y-6, 12, 12 ); 
  }
}