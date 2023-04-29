import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class MyGameFrame extends JFrame implements KeyListener{
	private static final int WIDTH = 500;
	private static final int HEIGHT = 300;
	private Tank mainTank = null;
	private ArrayList<Tank> tanks = new ArrayList<>();
	private ArrayList<Bullet> bullets = new ArrayList<>();
	private ArrayList<Bullet> bulletsNPC = new ArrayList<>();
	
	public MyGameFrame(){
		Tank atank;
		// TODO Auto-generated constructor stub
		setTitle("Ì¹¿Ë´óÕ½");
		setSize(WIDTH,HEIGHT);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainTank = new Tank(100, 100);		
				
		atank = new TankNPC(200, 100);		
		tanks.add(atank);
		
		setVisible(true);
		this.addKeyListener(this);
		Thread thread = new Thread(new GameThread());
		thread.start();
	}	
	private Image offScreenImage = null;
	private Graphics gOffScreen = null;
	
	public void paint(Graphics g) {	
		Tank atank;	
		if(offScreenImage == null) {
			offScreenImage = this.createImage(WIDTH,HEIGHT);
			gOffScreen = offScreenImage.getGraphics();
		}		
		super.paint(gOffScreen);
		gOffScreen.setColor(Color.BLACK);		
		gOffScreen.fillRect(0, 0, WIDTH, HEIGHT);
		mainTank.draw(gOffScreen);
		for(int i=0;i<tanks.size();i++) {
			atank = tanks.get(i);
			atank.draw(gOffScreen);
		}
		for(Bullet b:bullets) {
			b.draw(gOffScreen);
		}	
		for(Bullet b:bulletsNPC) {
			b.draw(gOffScreen);
		}	
		g.drawImage(offScreenImage, 0, 0,null);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key;
		Tank atank;
		int dir=0;
		key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_UP:
				mainTank.setDirection(Tank.UP) ;break;
			case KeyEvent.VK_RIGHT:
				mainTank.setDirection(Tank.RIGHT);break;
			case KeyEvent.VK_DOWN:
				mainTank.setDirection(Tank.DOWN);break;
			case KeyEvent.VK_LEFT:
				mainTank.setDirection(Tank.LEFT);break;
			case KeyEvent.VK_SPACE:
				Bullet b = mainTank.fire();
				if(b != null)
					bullets.add(b);
				break;	
				}	
		;		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	private class GameThread implements Runnable{
		Tank atank;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				mainTank.move();
				for(int i=0;i<tanks.size();i++) {
					atank = tanks.get(i);
					atank.move();
					Random rand = new Random();
					//System.out.println(rand.nextInt());
					if(rand.nextInt(10)==1) {
						Bullet bullet = atank.fire();
						System.out.println("aaaaaa");
						if(bullet != null) {
							bulletsNPC.add(bullet);
						}
					}
				}
				for(int i=bullets.size()-1;i>=0;i--) {
					Bullet b = bullets.get(i);			
					b.move();
					if(b.isClick(0,0,WIDTH,HEIGHT))
						bullets.remove(i);
				}
				for(Bullet b:bulletsNPC) {
					b.move();
					//if(b.isClick(0,0,500,300))
					//	bullets.remove(index)
				}
				
				
				repaint();
				try {
					Thread.sleep(100);				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		}		
	}
}
