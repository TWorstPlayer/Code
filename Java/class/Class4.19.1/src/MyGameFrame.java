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
	private static final int WIDTH=500;
	private static final int HEIGHT=300;
	private Tank mainTank = null;
	private ArrayList<Tank> tanks = new ArrayList<Tank>();		//
	private ArrayList<Bullet> bullets = new ArrayList<Bullet>();	//
	private ArrayList<Bullet> NPCbullets = new ArrayList<Bullet>();	//
	Image offScreenImage=null;			//研究研究
	Graphics gOffScreen=null;			//
	public MyGameFrame(){
		Tank atank;
		// TODO Auto-generated constructor stub
		setTitle("坦克大战");
		setSize(500,300);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainTank = new Tank(100, 100);

		atank = new TankNPC(200, 100);
		tanks.add(atank);

		setVisible(true);
		this.addKeyListener(this);
		Thread thread = new Thread(new GameThread());
		thread.start();

		offScreenImage=this.createImage(WIDTH,HEIGHT);		//
		gOffScreen=offScreenImage.getGraphics();			//
	}

	public void paint(Graphics g) {

		gOffScreen.setColor(Color.BLACK);					//
		gOffScreen.fillRect(0,0,WIDTH,HEIGHT);//


		Tank atank;
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		mainTank.draw(gOffScreen);										//
		for(int i=0;i<tanks.size();i++) {
			atank = tanks.get(i);
			atank.draw(gOffScreen);
		}
		for(Bullet bullet:bullets)			//
			bullet.draw(gOffScreen);		//
		g.drawImage(offScreenImage,0,0,WIDTH,HEIGHT,null);//
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key;
		Tank atank;
		int dir=0;
		key = e.getKeyCode();
		Bullet bullet;
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
				bullet=mainTank.fire();
				if(bullet!=null)
					bullets.add(bullet) ;
				break;		//
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
			Bullet bullet =null;
			Random random=new Random();
			// TODO Auto-generated method stub
			while(true) {
				mainTank.move();
				for(int i=0;i<tanks.size();i++) {
					atank = tanks.get(i);
					atank.move();
					bullet =atank.fire();
					if(bullet!=null)
						NPCbullets.add(bullet);
					//
				}
				for(Bullet bullet:bullets)
					bullet.move();

				repaint();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
