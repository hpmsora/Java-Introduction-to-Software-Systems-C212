import javax.swing.*;
import java.awt.event.*;

class Two extends JFrame implements MouseListener {
  Two() {
    this.setVisible(true);
    this.setSize(300, 300);
  }
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mouseClicked(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {
    System.out.println(e);
  }
  public static void main(String[] args) {
    JFrame f = new Two();
    f.addMouseListener((MouseListener) f);
  }
}