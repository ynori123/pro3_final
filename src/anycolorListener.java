import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class anycolorListener extends JFrame implements ActionListener {
	private Graphics g;

	public anycolorListener(Graphics g) {
		this.g = g;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
        JColorChooser colorchooser = new JColorChooser();
		Color color = colorchooser.showDialog(this, "Choose Color", Color.white);
        if(color != null){
            g.setColor(color);
        }
    }
}
