import java.awt.*;
import java.applet.*;

public class Picture1 extends Applet{
	public void paint(Graphics g) {
		
		int[] x1 = {150, 150, 120};
		int[] y1 = {70, 100, 100};
		
		int[] x2 = {209, 209, 239};
		int[] y2 = {70, 100, 100};
		
		g.setColor (Color.blue);
		g.fillRect(100, 100, 150, 30);
		g.fillRect(150, 70, 60, 30);
		g.fillPolygon(x1, y1, 3);
		g.fillPolygon(x2, y2, 3);
		
		g.setColor (Color.black);
		g.fillOval(120, 115, 30, 30);
		g.fillOval(200, 115, 30, 30);
		
		g.setColor(Color.yellow);
		g.fillRect(100, 105, 20, 15);
	}
}