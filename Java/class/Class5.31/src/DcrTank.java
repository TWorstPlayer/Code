import java.awt.Graphics;

public class DcrTank implements ITank{
	private ITank tank;
	public DcrTank(ITank atank) {
		tank = atank;
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return tank.getX();
	}

	@Override
	public void setLocation(int ax, int ay) {
		// TODO Auto-generated method stub
		tank.setLocation(ax, ay);
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return tank.getY();
	}

	@Override
	public int getR() {
		// TODO Auto-generated method stub
		return tank.getR();
	}

	@Override
	public void setDirection(int adir) {
		// TODO Auto-generated method stub
		tank.setDirection(adir);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		tank.move();
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		tank.draw(g);				
	}

	@Override
	public Bullet fire() {
		// TODO Auto-generated method stub
		return tank.fire();
	}

	@Override
	public EtnkAnimation explore() {
		// TODO Auto-generated method stub
		return tank.explore();
	}

}
