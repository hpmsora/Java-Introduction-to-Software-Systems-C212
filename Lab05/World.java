import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import java.util.Random;
import java.util.*;

class World extends JComponent implements MouseMotionListener, MouseListener, ActionListener {
  ArrayList<Circle> circles = new ArrayList<Circle>(); 
  public void paintComponent(Graphics g) {        
    for (Circle c : this.circles) 
      c.draw(g); }
  public void mouseMoved   (MouseEvent e) { } 
  public void mouseDragged (MouseEvent e) { } 
  public void mouseEntered (MouseEvent e) { } 
  public void mouseExited  (MouseEvent e) { } 
  public void mousePressed (MouseEvent e) { 
    Random rand = new Random();
    int x = e.getX(), y = e.getY(); 
    this.circles.add( new Circle( x, y, 1, new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat())));} 
  public void mouseReleased(MouseEvent e) { } 
  public void mouseClicked (MouseEvent e) { } 

  public void actionPerformed(ActionEvent e) { 
    for (Circle c : this.circles) 
      c.enlarge();
    this.repaint();
  }
}