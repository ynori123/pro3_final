import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class lineButtonListener implements ActionListener {
	private JMenuItem lineButton;

	public lineButtonListener(JMenuItem lineButton) {
		this.lineButton = lineButton;
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Changed to LineMode");
		lineButton.setEnabled(false);
	}
	
	

}
