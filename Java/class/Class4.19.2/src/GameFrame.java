import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{
	private static final int WIDTH=500;
	private static final int HEIGHT=300;
	private Tank mainTank;
	private ArrayList<TankNPC> tanks=new ArrayList<>();
	private ArrayList<Bullet> bullets=new ArrayList<>();
	private ArrayList<Bullet> NPCbullets=new ArrayList<>();
	private Image offScreenImage = null;
	private Graphics gOffScreen = null;
	public GameFrame() {
		TankNPC atank;
	
		setTitle("坦克大战");
		setSize(WIDTH,HEIGHT);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			mainTank = new Tank(100,100);		
			atank = new TankNPC(200,100);					
			tanks.add(atank);
			
		setVisible(true);		
		this.addKeyListener(this);		
		
		Thread gameThread = new Thread(new MyThread());
		gameThread.start();				
	}	
	public void paint(Graphics g) {
		if(gOffScreen == null) {
			offScreenImage = this.createImage(WIDTH,HEIGHT);
			gOffScreen = offScreenImage.getGraphics();
		}
		gOffScreen.setColor(Color.BLACK);
		gOffScreen.fillRect(0,0,WIDTH,HEIGHT);
	
		mainTank.draw(gOffScreen);
		for(TankNPC tank:tanks) {
			tank.draw(gOffScreen);
		}
		for(Bullet bullet:bullets) 
			bullet.draw(gOffScreen);
		for(Bullet bullet:NPCbullets)
			bullet.draw(gOffScreen);
		g.drawImage(offScreenImage, 0, 0, WIDTH,HEIGHT,null);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		int dir=0;
		Bullet bullet;
		switch(key) {
		case KeyEvent.VK_UP:   
			mainTank.setDirection(Tank.UP);break;
		case KeyEvent.VK_RIGHT:
			mainTank.setDirection(Tank.RIGHT);break;
		case KeyEvent.VK_DOWN: 
			mainTank.setDirection(Tank.DOWN);break;
		case KeyEvent.VK_LEFT: 
			mainTank.setDirection(Tank.LEFT);break;
		case KeyEvent.VK_SPACE: 
			bullet = mainTank.fire();
			if(bullet != null)
				bullets.add(bullet);
			break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private class MyThread implements Runnable{

		@Override
		public void run() {
			Bullet b = null;
			Random random = new Random();
			// TODO Auto-generated method stub
			while(true) {
				mainTank.move();
				for(TankNPC tank:tanks) {
					tank.move();
					if(random.nextInt(20) == 1) {
						b = tank.fire();						
						if(b != null)
							NPCbullets.add(b);
					}
				}
				for(Bullet bullet:bullets)
					bullet.move();
				for(Bullet bullet:NPCbullets)
					bullet.move();
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
/*
 * 坦克可以发射炮弹，炮弹绘制在窗体上，按坦克的方向前进，以坦克两倍的速度移动。
 * 
 * */
