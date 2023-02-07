import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class redButtonListener implements ActionListener {
	private Graphics g; 
	
	
	public redButtonListener(Graphics g) {
		this.g = g;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(new Color(255,0,0));
		System.out.println("Changed to Red");
	}

}
