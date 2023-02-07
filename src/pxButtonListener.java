import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class pxButtonListener implements ActionListener {
	private int px;
	private Graphics g;
	public pxButtonListener(int px,Graphics g) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.px = px;
		this.g = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		Graphics2D g2 = (Graphics2D)g;
		BasicStroke bs = new BasicStroke(px);
		g2.setStroke(bs);
	}

}
