import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Tank {
	public static final int UP = 0;
	public static final int RIGHT = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	
	protected int x;
	protected int y;
	private int imgX,imgY;
	protected int dir=0;//0 up 1 right 2 down 3 left
	protected Image img; 
	protected int flag=0;
	protected int coolDown=0;
//	private int category;
	
	public Tank(int ax,int ay) {
		File f = new File("D:\\robots_sprite.png");
		try {
			img = ImageIO.read(f);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		x = ax;
		y = ay;
	}
	public int getX() {return x;}
	public void setX(int ax) { x = ax;}
	public int getY() {return y;}
	public int getR() {return 15;}
	public void setDirection(int adir) {
		dir = adir;
		imgX = dir*68;		
	}
	public void move() {	
		switch(dir) {
		case 0:	y -= 2;break;
		case 1: x += 2;break;
		case 2: y += 2;break;
		case 3: x -= 2;break;
		}
	}
	public void draw(Graphics g) {
		coolDown++;
		flag = (flag+1)%2;
		if(flag == 0)
			g.drawImage(img, x-17, y-17, x+17, y+17, imgX, 0, 34+imgX,34, null);
		else
			g.drawImage(img, x-17, y-17, x+17, y+17, imgX+34, 0, 68+imgX,34, null);		
	}
	public Bullet fire() {
		int ax,ay;
		Bullet bullet=null;
		ax = x;
		ay = y;
		if(coolDown >= 5) {		
			switch(dir) {
			case UP:ay -=17;break;
			case RIGHT:ax += 17;break;
			case DOWN: ay += 17;break;
			case LEFT: ax -= 17;break;
			}
			bullet = new Bullet(ax,ay,dir);
			coolDown=0;
		}
		return bullet;
	}
	public EtnkAnimation explore() {
		return new EtnkAnimation(x,y);
	}
	
}

