import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Exam {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setSize(200, 200);
		j.addMouseMotionListener(new A_sub_1());
		A_sub_2 action = new A_sub_2();
		j.addKeyListener(new A_sub_3());
	}
}

class A_sub_1 implements MouseMotionListener {
	public void mouseMoved(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		System.out.println("Distance from origin is " + Math.sqrt(x*x + y*y));
	}
	public void mouseDragged(MouseEvent e) {}
}

class A_sub_2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int x = e.getID();
		System.out.println(x);
	}
}

class A_sub_3 implements KeyListener {
	public void keyPressed(KeyEvent e) {
		int x = e.getID();
		System.out.println(x);
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}


