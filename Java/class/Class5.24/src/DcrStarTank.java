import java.awt.Color;
import java.awt.Graphics;

public class DcrStarTank extends DcrTank{
	public DcrStarTank(ITank atank) {
		super(atank);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g) {
		super.draw(g);
		g.setColor(Color.red);
		g.drawLine(getX(), getY(), getX()-34,getY()-34);
	}
}
