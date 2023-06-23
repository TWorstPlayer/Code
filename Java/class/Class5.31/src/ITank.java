import java.awt.Graphics;

public interface ITank {
	public int getX(); 
	public void setLocation(int ax,int ay) ;
	public int getY() ;
	public int getR() ;
	public void setDirection(int adir);
	public void move() ;
	public void draw(Graphics g) ;
	public Bullet fire() ;
	public EtnkAnimation explore() ;
}
