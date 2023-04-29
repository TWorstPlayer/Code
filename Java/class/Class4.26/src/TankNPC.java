import java.awt.Graphics;
import java.util.Random;

public class TankNPC extends Tank{
	public TankNPC(int ax,int ay) {
		super(ax,ay);
		imgY=34;
	}
	public void move() {
		Random random = new Random();
		int isChange;
		isChange = random.nextInt(10);
		if(isChange == 1)
			super.setDirection(random.nextInt(4));
		super.move();
	}


}
