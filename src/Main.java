import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.image.BufferedImage;


// Note : Read README.md

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame frame = new JFrame("Let's Paint!");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		
		// frame.getContentPane().setBackground(new Color(255,255,255));	
				
		// パネルの作成
		JPanel panel = new JPanel();
		panel.setBounds(5, 25, 475, 405);
		LineBorder border = new LineBorder(Color.black, 1, true);
		panel.setBorder(border);
		panel.setOpaque(false);
		panel.setBackground(new Color(255,255,255));
		frame.add(panel);

		//メニューバーの作成
		JMenuBar menubar = new JMenuBar();

		// 各要素の作成
		// Color menu
		JMenu menu1 = new JMenu("Color");

		// Black item
		JMenuItem item1_1 = new JMenuItem("Black");
		item1_1.setActionCommand("Black");
		menu1.add(item1_1);

		// Red item
		JMenuItem item1_2 = new JMenuItem("Red");
		item1_2.setActionCommand("Red");
		menu1.add(item1_2);

		// Blue item
		JMenuItem item1_3 = new JMenuItem("Blue");
		item1_3.setActionCommand("Blue");
		menu1.add(item1_3);

		// Green item
		JMenuItem item1_4 = new JMenuItem("Green");
		item1_4.setActionCommand("Green");
		menu1.add(item1_4);

		// Rainbow item
		JMenuItem item1_5 = new JMenuItem("Rainbow");
		item1_5.setActionCommand("Rainbow");
		menu1.add(item1_5);
		
		// AnyColor item
		JMenuItem item1_6 = new JMenuItem("Any color");
		item1_6.setActionCommand("AnyColor");
		menu1.add(item1_6);
		
		menubar.add(menu1);

		// Width menu
		JMenu menu2 = new JMenu("Width");
		
		// 1px item
		JMenuItem item2_1 = new JMenuItem("1px");
		item2_1.setActionCommand("1px");
	
		menu2.add(item2_1);
		// 5px item
		JMenuItem item2_2 = new JMenuItem("5px");
		item2_2.setActionCommand("5px");
		
		menu2.add(item2_2);
		
		// 10px item
		JMenuItem item2_3 = new JMenuItem("10px");
		item2_3.setActionCommand("10px");
	
		menu2.add(item2_3);

		menubar.add(menu2);

		// Combo boxの作成
		JComboBox<String> combobox = new JComboBox<String>();
		combobox.setPreferredSize(new Dimension(80, 30));
		
		// Pen item
		combobox.addItem("Pen");
		// Line item
		combobox.addItem("Line");
		// Triangle item
		combobox.addItem("Triangle");
		// Eraser item
		combobox.addItem("Eraser");
		// Cross stamp item
		combobox.addItem("Cross");
		// Star stamp item
		combobox.addItem("Star");

		combobox.setBounds(0,0,80,20);
		frame.add(combobox);
		
		// Initialize Button
		JButton init = new JButton("初期化");
		init.setBounds(80, 0, 80, 20);
		frame.add(init);
	   

		// Buffer
		// BufferedImage bi = new BufferedImage();
	     
		frame.setJMenuBar(menubar);
		
		frame.setVisible(true);

		Graphics g = panel.getGraphics();
		item1_1.addActionListener(new blackButtonListener(g));
		item1_2.addActionListener(new redButtonListener(g));
		item1_3.addActionListener(new blueButtonListener(g));
		item1_4.addActionListener(new greenButtonListener(g));
		item1_5.addActionListener(new rainbowButtonListener(g, item1_5));
		item1_6.addActionListener(new anycolorListener(g));
		item2_1.addActionListener(new pxButtonListener(1, g));
		item2_2.addActionListener(new pxButtonListener(5, g));
		item2_3.addActionListener(new pxButtonListener(10, g));
		combobox.addActionListener(new selectActionListener(combobox, g));
		init.addActionListener(new initButtonListener(g, frame));
		
		
        MousePaintListener listener = new MousePaintListener(g, combobox, item1_5);
        panel.addMouseListener(listener);
		panel.addMouseMotionListener(listener);
   
		
	}

}
