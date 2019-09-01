package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageMorph extends BluePolymorph{
	String filename;
	BufferedImage img;
	ImageMorph(int x, int y, int w, int h, String filename) {
		super(x, y, w, h);
		this.filename=filename;
		img = (BufferedImage) getImage(filename);
		// TODO Auto-generated constructor stub
	}
	private Image getImage(String filename) {
		// TODO Auto-generated method stub
		String src = new File("").getAbsolutePath() + "/src/_03_polymorphs/";
		BufferedImage tempimage = null;
		System.out.println(src+filename);
		try {
			File f = new File(src+filename);
			tempimage = ImageIO.read(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempimage;
	}
	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
//		AffineTransform transform = AffineTransform.getTranslateInstance(x, y);
//		transform.scale(w/img.getWidth(), h/img.getHeight());
//		g2.fillRect(x, y, w, h);
		g2.drawImage(img, x, y, w, h, null);
		
	}

}
