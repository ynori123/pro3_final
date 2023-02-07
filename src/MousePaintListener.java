import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.event.MouseInputListener;

public class MousePaintListener implements MouseInputListener {
	private Color rgb;
	String color;
	Graphics g;
	int[] x1 = new int[2];
	int[] y1 = new int[2];
	int[] x2 = new int[3];
	int[] y2 = new int[3];
	int[] starX = new int[5];
	int[] starY = new int[5];
	int i;
	int starR;
	private JMenuItem rainbowItem;
	
	private JComboBox<String> comboBox;
	int lastx, lasty, newx, newy;
	public MousePaintListener(Graphics g, JComboBox<String> comboBox, JMenuItem rainbowItem) {
		this.g = g;
		this.rainbowItem = rainbowItem;
		i = 0;
		this.comboBox = comboBox;
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(comboBox.getSelectedItem() == "Cross"){
			// Cross stamp
			// よこ
			g.fillRect(e.getX()-15, e.getY()-3, 30, 6);
			// たて
			g.fillRect(e.getX()-3, e.getY()-15, 6, 30);
		}
		if(comboBox.getSelectedItem() == "Star"){
			// Star stamp (r = 30)
			starR = 30;
			int[] starX = {30, 9, -24, -24, 9};
			int[] starY = {0 ,29, 18,-18 ,-29};
			// Point part
			for(int i = 0; i < 5; i++){
				starX[i] += e.getX();
				starY[i] += e.getY();
				System.out.printf("%d, %d%n", starX[i], starY[i]);
			}
			

			// Line part
			// p1 to p3
			g.drawLine(starX[0], starY[0], starX[2], starY[2]);
			// p1 to p4
			g.drawLine(starX[0], starY[0], starX[3], starY[3]);
			// p2 to p4
			g.drawLine(starX[1], starY[1], starX[3], starY[3]);
			// p2 to p5
			g.drawLine(starX[1], starY[1], starX[4], starY[4]);
			// p3 to p5
			g.drawLine(starX[2], starY[2], starX[4], starY[4]);
		}
		tri:
		if(comboBox.getSelectedItem() == "Line") {
			
			x1[i] = e.getX();
			y1[i] = e.getY();
			
			if(i == 1) {
				g.drawLine(x1[0],y1[0],x1[1],y1[1]);
				x1[0] = 0;x1[1] = 0;
				y1[0] = 0;y1[1] = 0;
				i = 0;
				break tri;
			}else {
				i = 0;
			}
			i++;
			
		}else if(comboBox.getSelectedItem() == "Triangle") {
			x2[i] = e.getX();
			y2[i] = e.getY();
			if(i == 2) {
				g.drawPolygon(x2,y2,3);
				x2[0] = 0;x2[1] = 0;x2[2] = 0;
				y2[0] = 0;y2[1] = 0;y2[2] = 0;
				i = 0;
				break tri;
			}else {
				i = 0;
			}
			i++;
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		lastx = e.getX();
		lasty = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		Random rd = new Random();
		rgb = new Color(rd.nextInt(256),rd.nextInt(256),rd.nextInt(256));
		if(!rainbowItem.isEnabled()){
			g.setColor(rgb);
		}
		newx = e.getX();
		newy = e.getY();
		if(comboBox.getSelectedItem() == "Pen" || comboBox.getSelectedItem() == "Eraser") {
			g.drawLine(lastx,lasty,newx,newy);
			
		}
		lastx = newx;
		lasty = newy;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}
	

}
