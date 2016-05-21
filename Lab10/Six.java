import javax.swing.*;
import java.awt.event.*;

public class Six {
	public static void main(String[] args) {
		Timer t = new Timer(500, new Helper());
		t.start();
		JFrame j = new JFrame();
	}
}

class Helper implements ActionListener {
	int count = 0;
	public void actionPerformed(ActionEvent e) {
		this.count += 1;
		System.out.println("Howdy: " + this.count);
	}
}
