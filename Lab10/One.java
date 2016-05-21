import javax.swing.*;
import java.awt.event.*;

public class One {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(200, 200);
		f.addMouseMotionListener(new Helper());
		
	}
}

class Helper implements MouseMotionListener {
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("(" + x + ", " + y + ")");
	}
	public void mouseDragged(MouseEvent e) {}
}
