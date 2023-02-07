import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JComboBox;

public class selectActionListener implements ActionListener {
	
	private JComboBox<String> comboBox;
	private Graphics g;
	public selectActionListener(JComboBox<String> comboBox, Graphics g) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.comboBox = comboBox;
		this.g = g;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		String s = comboBox.getItemAt(comboBox.getSelectedIndex());
		if(comboBox.getSelectedItem() == "Eraser"){
			g.setColor(new Color(255,255,255));
		}else if(comboBox.getSelectedItem() == "Pen"){
			g.setColor(new Color(0,0,0));
		}
		System.out.println(s);

	}
	
	public String whatString(){
		return comboBox.getItemAt(comboBox.getSelectedIndex());
	}

}
