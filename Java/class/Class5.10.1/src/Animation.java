import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Animation {
	private int COUNT;
	private int x;
	private int y;
	protected int imgX;
	protected int imgY;
	private int frame=0;
	private static Image img;
	public Animation(int ax,int ay,int acount) {
		x = ax;
		y = ay;
		COUNT = acount;

		File f;
		f = new File("D:\\robots_sprite.png");
		try {
			img = ImageIO.read(f);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void draw(Graphics g) {		
		g.drawImage(img, x-17, y-17, x+17, y+17, 
				imgX+frame*34, imgY, 
				imgX+34+frame*34, imgY+34,null);
		frame++;
	}
	public boolean isVisible() {
		return frame<COUNT;
	}
}
