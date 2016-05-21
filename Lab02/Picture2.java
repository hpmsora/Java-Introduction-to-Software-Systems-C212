import java.applet.*;
import java.awt.*;

public class Picture2 extends Applet {
	public void paint(Graphics g) {
		
		int[] x1 = {100, 100, 130, 300, 330, 330, 180, 180, 175, 175};
		int[] y1 = {300, 350, 380, 380, 350, 300, 300, 100, 100, 300};
		
		int[] x2 = {180, 300, 180};
		int[] y2 = {103, 265, 265};
		
		Color c = new Color(156, 93, 82);
		g.setColor (c);
		g.fillPolygon(x1, y1, 10);
		
		g.setColor (Color.gray);
		g.fillPolygon(x2, y2, 3);
	}

}
