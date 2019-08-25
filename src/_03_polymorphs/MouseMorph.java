package _03_polymorphs;

public class MouseMorph extends MovingMorph{

	MouseMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}
	void update(int x,int y) {
		this.x=x;
		this.y=y;
	}

}
