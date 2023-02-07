import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class blueButtonListener implements ActionListener {
	private Graphics g;
	public blueButtonListener(Graphics g) {
		this.g = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(new Color(0, 0, 255));
	}

}
