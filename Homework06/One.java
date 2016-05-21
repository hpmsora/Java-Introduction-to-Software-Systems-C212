import javax.swing.*;
import java.awt.event.*;

public class One {
 public static void main(String[] args) {
  JFrame a = new JFrame();
  a.setVisible(true);
  a.setSize(200, 200);
  a.addMouseMotionListener(new Helper());
  
 }
}

class Helper implements MouseMotionListener {
 public void mouseMoved(MouseEvent e) {
  int x = e.getX(), y = e.getY();
  System.out.println("(" + x + ", " + y + ")");
 }
 public void mouseDragged(MouseEvent e) {}
}
