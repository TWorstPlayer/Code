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
	private ITank mainTank;
	private ArrayList<ITank> tanks=new ArrayList<>();
	private ArrayList<Bullet> bullets=new ArrayList<>();
	private ArrayList<Bullet> NPCbullets=new ArrayList<>();
	private ArrayList<Animation> animations = new ArrayList<>();
	private Image offScreenImage = null;
	private Graphics gOffScreen = null;
	private ICreateStrategy createStrategy;
	public void setStrategy(ICreateStrategy obj) {
		createStrategy = obj;
	}
	public GameFrame() {
		
	
		setTitle("̹�˴�ս");
		setSize(WIDTH,HEIGHT);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainTank = new Tank(100,100);
		mainTank = new DcrBloodTank(mainTank);
	//	mainTank = new DcrStarTank(mainTank);
		tanks.add(new TankNPC(200,100));
			
			
		
					
	}	
	public void start() {
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
		for(ITank tank:tanks) {
			tank.draw(gOffScreen);
		}
		for(Bullet bullet:bullets) 
			bullet.draw(gOffScreen);
		for(Bullet bullet:NPCbullets)
			bullet.draw(gOffScreen);
		for(int i=animations.size()-1;i>=0;i--) {
			Animation ani = animations.get(i);
			if(ani.isVisible())
				ani.draw(gOffScreen);
			else
				animations.remove(i);
		}
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
	
	private class MyThread implements Runnable,IAnimationFinishObserver{

		@Override
		public void run() {
			int[] pos = {100,250,400};
			Bullet b = null;
			Random random = new Random();
			// TODO Auto-generated method stub
			while(true) {
				mainTank.move();
				if(createStrategy != null) {
					ITank atank = createStrategy.createTank();
					if(atank != null)
						tanks.add(atank);
				}
//				if(random.nextInt(10) ==1) {
//					tanks.add(new TankNPC(pos[random.nextInt(3)],100));
//				}
				for(ITank tank:tanks) {
					tank.move();
					if(random.nextInt(20) == 1) {
						b = tank.fire();						
						if(b != null)
							NPCbullets.add(b);
					}
				}
				Bullet bullet;
				ITank tank;
				for(int i=bullets.size()-1;i>=0;i--) {
					bullet=bullets.get(i);
					bullet.move();
					if(bullet.isClick(15, 38,WIDTH-15,HEIGHT-15)) {
						animations.add(bullet.explore());
						bullets.remove(i);
					}else {
						for(int j=tanks.size()-1;j>=0;j--) {
							tank = tanks.get(j);
							if(bullet.isClick(tank)) {
								animations.add(tank.explore());
								bullets.remove(i);
								tanks.remove(j);
								break;
							}
						}
					}
				}
				for(int i=NPCbullets.size()-1;i>=0;i--) {
					bullet=NPCbullets.get(i);
					bullet.move();
					if(bullet.isClick(15, 38,WIDTH-15,HEIGHT-15)) {
						animations.add(bullet.explore());
						NPCbullets.remove(i);
					}else if(bullet.isClick(mainTank)) {						
						EtnkAnimation am1 = mainTank.explore();
						am1.addListener(()->{
							RebirthAnimation obj = new RebirthAnimation(100,100);
							obj.addListener(this);
							animations.add(obj);}
						);
						animations.add(am1);
						mainTank.setLocation(-1000,-1000);
						
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

		@Override
		public void doSomething() {
			// TODO Auto-generated method stub
			mainTank.setLocation(100,100);
		}
		
	}

}
/*
 * ̹�˿��Է����ڵ����ڵ������ڴ����ϣ���̹�˵ķ���ǰ������̹���������ٶ��ƶ���
 * 
 * */
