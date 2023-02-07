import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class triButtonListener implements ActionListener {
	private JButton triButton;

	public triButtonListener(JButton triButton) {
		this.triButton = triButton;
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Changed to triangleMode");
		triButton.setEnabled(false);
	}

}
