import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Five {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(300, 300);
		f.addKeyListener(new Helper());
	}
}

class Helper implements KeyListener {
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}
