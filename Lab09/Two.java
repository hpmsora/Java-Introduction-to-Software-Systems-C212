import java.awt.event.*;
import javax.swing.*;

class Two extends JFrame implements ActionListener, KeyListener {
  public void keyPressed (KeyEvent e) { }
  public void keyReleased(KeyEvent e) { }
  public void keyTyped   (KeyEvent e) {
    System.out.println(" kieo;wry34rt ");
    numberTextFieldTotal.setText("");
  }
  public void actionPerformed(ActionEvent e) {
    // System.out.println( e );
	  numberTextFieldTotal.setText( "" + Integer.parseInt( numberTextField.getText())*Integer.parseInt( numberTextField2.getText()));
  }
  JTextField numberTextField2;
  JTextField numberTextField;
  JTextField numberTextFieldTotal;
  JLabel numberLabel1, numberLabel2, totalLabel;
  Two() {
    JButton action;
    JPanel panel = new JPanel();
    panel.setLayout( null );
    numberLabel1 = new JLabel("Cartons per Shipment: ");
    numberLabel1.setBounds(30, 30, 150, 20);
    panel.add(numberLabel1);
    numberLabel2 = new JLabel("Items per carton: ");
    numberLabel2.setBounds(30, 60, 120, 20);
    panel.add(numberLabel2);
    numberTextField = new JTextField();
    //  numberTextField.setPreferredSize( new Dimension(60,20));
    numberTextField.setBounds(190, 30, 80, 20);
    numberTextField.addKeyListener( this );
    panel.add(numberTextField);
    numberTextField2 = new JTextField();
    numberTextField2.setBounds(190, 60, 80, 20);
    numberTextField2.addKeyListener( this );
    panel.add(numberTextField2);
    action = new JButton( "Calculate" );
    action.setBounds(300, 60, 100, 20);
    panel.add( action );
    action.addActionListener( this );
    totalLabel = new JLabel( "Total: " );
    totalLabel.setBounds(300, 30, 80, 20);
    panel.add(totalLabel);
    numberTextFieldTotal = new JTextField();
    numberTextFieldTotal.setBounds(350, 30, 120, 20);
    numberTextFieldTotal.setEnabled(false);
    numberTextFieldTotal.addKeyListener( this );
    panel.add(numberTextFieldTotal);
    this.add(panel);
    this.setSize(500, 140);
    this.setVisible(true);
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
  public static void main(String[] args) {
    Two frame = new Two();
  }
}