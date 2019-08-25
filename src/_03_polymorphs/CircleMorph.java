package _03_polymorphs;

public class CircleMorph extends MovingMorph{
	protected int radius;
	protected int cx, cy;
	CircleMorph(int x, int y, int w, int h, int r, int cx, int cy) {
		super(x, y, w, h);
		radius=r;
		this.cx=cx;
		this.cy=cy;
		// TODO Auto-generated constructor stub
	}
	public void update() {
		double theta = Math.atan2(y-cy, x-cx);
		double delta = 0.1;
		x=(int) (cx+Math.cos(theta+delta)*radius);
		y=(int) (cy+Math.sin(theta+delta)*radius);
		
	}

}
