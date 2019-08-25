package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class OptionMorph extends BluePolymorph {

	OptionMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x, y, w, h);
	}
	public void click(int x, int y) {
		if (x>this.x&&x<this.x+w&&y>this.y&&x<this.y+h) {
			JOptionPane.showMessageDialog(null, "hi");
		}
	}

}
