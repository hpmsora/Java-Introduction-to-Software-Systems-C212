import java.applet.*;
import java.awt.*;

public class Picture3 extends Applet {
	public void paint(Graphics g) {
		
		Color c = new Color(156, 93, 82);
		
		int[] x1 = {200, 120, 140, 100, 300, 260, 280};
		int[] y1 = {50, 180, 180, 260, 260, 180, 180};
		
		int[] x2 = {180, 180, 220, 220};
		int[] y2 = {260, 340, 340, 260};
		
		g.setColor(Color.green);
		g.fillPolygon(x1, y1, 7);
		
		g.setColor(c);
		g.fillPolygon(x2, y2, 4);
	}
}
