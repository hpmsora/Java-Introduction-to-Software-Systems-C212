
import javax.swing.*; 
import java.awt.event.*; 

class BigBang extends JFrame {
  Timer timer; 
  BigBang(int delay, String title, World world) {
    super("Big-Bang: " + title); 
    this.setVisible(true); 
    this.setSize(400, 400); 
    this.setDefaultCloseOperation(3); // EXIT_ON_CLOSE
    this.getContentPane().add( world ); 
    world.addMouseMotionListener(world); 
    world.addMouseListener(world); 
    this.timer = new Timer(delay, world); 
    this.timer.start(); 
  }
}


