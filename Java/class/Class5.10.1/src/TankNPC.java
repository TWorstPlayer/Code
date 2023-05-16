import java.awt.Graphics;
import java.util.Random;

public class TankNPC extends Tank{
	
	public TankNPC(int ax, int ay) {
		super(ax, ay);
		// TODO Auto-generated constructor stub
	}

	public void move() {
		Random random = new Random();
		if(random.nextInt(10)==1)
			this.setDirection(random.nextInt(4));
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
		g.drawImage(img, getX()-17, y-17, getX()+17, y+17, dir*68+flag*34, 34, flag*34+34+dir*68,68, null);
		
	}
}
