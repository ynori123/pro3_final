import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class changeButtonListener  implements ActionListener{
private Graphics g;
private JScrollBar rBar;
private JScrollBar gBar;
private JScrollBar bBar;
	public changeButtonListener(Graphics g, JScrollBar rBar, JScrollBar gBar, JScrollBar bBar) {
		this.g = g;
        this.rBar = rBar;
        this.gBar = gBar;
        this.bBar = bBar;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        // change color
        g.setColor(new Color(rBar.getValue(), gBar.getValue(), bBar.getValue()));
        System.out.printf("色が(%d,%d,%d)に変更されました．%n",rBar.getValue(), gBar.getValue(), bBar.getValue());
	}   
}