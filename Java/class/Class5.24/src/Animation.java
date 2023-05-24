import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Animation {
	private int COUNT;
	protected int x;
	protected int y;
	protected int imgX;
	protected int imgY;
	protected int frame=0;
	
	private ArrayList<IAnimationFinishObserver> observers = new ArrayList<>();
	
	public Animation(int ax,int ay,int acount) {
		x = ax;
		y = ay;
		COUNT = acount;		
	}
	public void draw(Graphics g) {		
		g.drawImage(GameResource.getInstance().getImage(), x-17, y-17, x+17, y+17, 
				imgX+frame*34, imgY, 
				imgX+34+frame*34, imgY+34,null);
		
		frame++;
	}
	public boolean isVisible() {
		if(frame >= COUNT) {
			for(IAnimationFinishObserver obj:observers)
				obj.doSomething();
		}
		return frame<COUNT;
	}
	public void addListener(IAnimationFinishObserver obj) {
		observers.add(obj);
	}
	public void removeListener(IAnimationFinishObserver obj) {
		observers.remove(obj);
	}
}
