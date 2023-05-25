import java.awt.Graphics;

public class RebirthAnimation extends Animation{

	public RebirthAnimation(int ax, int ay) {
		super(ax, ay, 12);
		// TODO Auto-generated constructor stub
		imgX = 34*13;
		imgY = 34*7;
	}
	public void draw(Graphics g) {	
		int tmp = frame%3;
		g.drawImage(GameResource.getInstance().getImage(), x-17, y-17, x+17, y+17, 
				imgX+tmp*34, imgY, 
				imgX+34+tmp*34, imgY+34,null);
		frame++;
	}

}
