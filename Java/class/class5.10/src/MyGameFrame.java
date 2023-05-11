import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
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
	private ArrayList<Animation>animations=new ArrayList<>();

	public MyGameFrame(){
		Tank atank;
		// TODO Auto-generated constructor stub
		setTitle("坦克大战");
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
		for(int i=animations.size()-1;i>=0;i--){
			Animation ani= animations.get(i);
			if(ani.isVisible())
				ani.draw(gOffScreen);
			else
				animations.remove(i);
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
			int[] pos={100,250,400};
			Random random=new Random();
			while(true) {
				mainTank.move();
				if(random.nextInt(10)==1){
					tanks.add(new TankNPC(random.nextInt(3),100));
				}
				for(int i=0;i<tanks.size();i++) {
					atank = tanks.get(i);
					atank.move();
					Random rand = new Random();

					if(rand.nextInt(10)==1) {
						Bullet bullet = atank.fire();
						if(bullet != null) {
							bulletsNPC.add(bullet);
						}
					}
				}
				for(int i=bullets.size()-1;i>=0;i--) {
					Bullet b = bullets.get(i);
					b.move();
					if(b.isCollide(10,10,WIDTH-20,HEIGHT-20)) {
						animations.add(b.explore());
						bullets.remove(i);
						break;
					}
				}
				for(int i=bulletsNPC.size()-1;i>=0;i--) {
					Bullet b = bulletsNPC.get(i);
					b.move();
					if(b.isCollide(15,35,WIDTH-20,HEIGHT-20)){
						animations.add(b.explore());
						bulletsNPC.remove(i);
					}

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
