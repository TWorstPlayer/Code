import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tank {
	public static final int UP=0;
	public static final int RIGHT=1;
	public static final int DOWN=2;
	public static final int LEFT=3;
	private int x;
	protected int y;
	protected int imgX,imgY;
	private int dir=0;//0 up 1 right 2 down 3 left
	protected Image img;
	protected int flag=0;
	private int coolTime=0;
	//private int category =0;
	public int getX() { return x;}
	public Tank(int ax,int ay) {
		File f;
		f = new File("D:\\robots_sprite.png");
		try {
			img = ImageIO.read(f);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		imgX = 0;
		imgY = 0;
		x = ax;
		y = ay;
	}
	
	public void setDirection(int adir) {		
		dir = adir;
		imgX = dir*68;			
	}
	public void move() {		
		switch(dir) {
		case 0:
			y -= 2;break; 
		case 1:
			x += 2;break;
		case 2:
			y += 2;break;
		case 3:
			x -= 2;break;
		}
	}
	public void draw(Graphics g) {
		flag = (flag+1)%2;
		if(flag == 0)
			g.drawImage(img, x-17, y-17, x+17, y+17, imgX, imgY, imgX+34, imgY+34,null);
		else
			g.drawImage(img, x-17, y-17, x+17, y+17, imgX+34, imgY, imgX+68, imgY+34,null);
		coolTime++;
	}
	public Bullet fire() {	
		int ax,ay;
		Bullet bullet=null;
		if(coolTime >=5) {
			ax = x;
			ay = y;
			switch(dir) {
			case UP: ay -= 17;break;
			case RIGHT:ax +=17;break;
			case DOWN:ay += 17;break;
			case LEFT:ax -= 17;break;			
			}
			bullet = new Bullet(ax,ay,dir);
			coolTime = 0;
		}
		return bullet;
	}

	
}
