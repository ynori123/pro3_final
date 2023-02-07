import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class rainbowButtonListener implements ActionListener{
    private Graphics g; 
	private JMenuItem item;
	
	public rainbowButtonListener(Graphics g, JMenuItem item) {
		this.g = g;
        this.item = item;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
        
		g.setColor(new Color(0,0,0));
        item.setEnabled(false);
		System.out.println("Changed to rainbow");
	}
}
