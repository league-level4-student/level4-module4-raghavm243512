package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    ArrayList<Polymorph> p = new ArrayList<Polymorph>();
    MouseMorph m;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.addMouseMotionListener(this);
   	 window.addMouseListener(this);
   	 window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 m=new MouseMorph(0, 0, 10, 10);
   	 p.add(new BluePolymorph(100, 100, 25, 25));
   	 p.add(new RedPolymorph(200, 200, 30, 30));
   	 p.add(new CircleMorph(450, 300, 20, 20, 100, 350, 300));
   	 p.add(new MovingMorph(20, 20, 30, 30));
   	 p.add(new OptionMorph(150, 150, 30, 30));
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, WIDTH, HEIGHT);
   	 m.draw(g);
   	 //draw polymorph
   	 for (Polymorph i : p) {
   		 i.draw(g);
   	 }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for (Polymorph i : p) {
  		 i.update();
  	 }
   	 
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		m.update(e.getX(),e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for (Polymorph i : p) {
			if (i.getClass() instanceof OptionMorph) {
				
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
