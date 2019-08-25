package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	protected int w;
	protected int h;
	private boolean left = true;
	private boolean down = true;
	MovingMorph(int x, int y, int w, int h) {
		super(x, y);
		this.w=w;
		this.h=h;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, w, h);
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	public void update(){
	   	 if (left)
	   		 x-=5;
	   	 else
	   		 x+=5;
	   	 if (down)
	   		 y+=5;
	   	 else 
	   		 y-=5;
	   	 
	   	 if (x>900-w)
	   		 left=true;
	   	 if (x<0)
	   		 left=false;
	   	if (y>600-h)
	   		 down=false;
	   	 if (y<0)
	   		 down=true;
	   	 
    }
}
