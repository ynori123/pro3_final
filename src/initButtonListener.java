import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class initButtonListener  implements ActionListener{
private Graphics g;
private JFrame frame;
	public initButtonListener(Graphics g, JFrame frame) {
		this.g = g;
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("init!");
		Color copy = g.getColor();
		g.setColor(Color.white);
		g.fillRect(0, 0, 475, 405);
		g.setColor(copy);
		frame.repaint();
	}   
}