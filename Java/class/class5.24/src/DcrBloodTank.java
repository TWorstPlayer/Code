import java.awt.Graphics;

public class DcrBloodTank extends DcrTank{

	public DcrBloodTank(ITank atank) {
		super(atank);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g) {
		super.draw(g);
		g.drawRect(getX(), getY(), 34, 2);
	}

}
