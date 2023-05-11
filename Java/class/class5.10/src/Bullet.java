import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bullet {
	private int x;
	protected int y;
	private int dir=0;//0 up 1 right 2 down 3 left
	protected Image img;
	
	public Bullet(int ax,int ay,int adir) {
		File f;
		f = new File("D:\\robots_sprite.png");
		try {
			img = ImageIO.read(f);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		x = ax;
		y = ay;
		dir = adir;
	}
	public void move() {
		
		switch(dir) {
		case 0:
			y -= 8;break; 
		case 1:
			x += 8;break;
		case 2:
			y += 8;break;
		case 3:
			x -= 8;break;
		}
	}
	public void draw(Graphics g) {		
		g.drawImage(img, x-17, y-17, x+17, y+17, 5*34, 6*34, 6*34, 7*34,null);

	}
	public boolean isCollide(int ax,int ay,int aw,int ah) {
		return x < ax || y < ay || x>aw || y > ah;
	}

	public EbltAnimation explore(){
		return new EbltAnimation(x,y);
	}

}
