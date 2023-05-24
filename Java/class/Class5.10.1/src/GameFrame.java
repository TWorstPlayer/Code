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
	private ArrayList<Animation> animations = new ArrayList<>();
	private Image offScreenImage = null;
	private Graphics gOffScreen = null;
	public GameFrame() {
		
	//这里是设置面板
		setTitle("坦克大战");
		setSize(WIDTH,HEIGHT);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainTank = new Tank(100,100);							
		tanks.add(new TankNPC(200,100));
			
		setVisible(true);		
		this.addKeyListener(this);		
		
		Thread gameThread = new Thread(new MyThread());
		gameThread.start();				
	}

	//这里这个是用双缓冲技术来绘图
	public void paint(Graphics g) {
		if(gOffScreen == null) {
			offScreenImage = this.createImage(WIDTH,HEIGHT);
			gOffScreen = offScreenImage.getGraphics();
		}
		gOffScreen.setColor(Color.BLACK);
		gOffScreen.fillRect(0,0,WIDTH,HEIGHT);
	
		mainTank.draw(gOffScreen);
		//绘制NPC坦克
		for(TankNPC tank:tanks) {
			tank.draw(gOffScreen);
		}
		//绘制NPC坦克的炮弹
		for(Bullet bullet:NPCbullets)
			bullet.draw(gOffScreen);
		//绘制玩家坦克的炮弹
		for(Bullet bullet:bullets) 
			bullet.draw(gOffScreen);
		//炮弹爆炸动画
		for(int i=animations.size()-1;i>=0;i--) {
			//get方法是Arraylist里面的一个方法
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
		//更改setDirection的参数，相当于更改了玩家坦克的方向
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
			int[] pos = {100,250,400};
			Bullet b = null;
			Random random = new Random();
			// TODO Auto-generated method stub
			while(true) {
				//
				mainTank.move();
				//随机添加NPC坦克
				if(random.nextInt(10) ==1) {
					tanks.add(new TankNPC(pos[random.nextInt(3)],100));
				}
				for(TankNPC tank:tanks) {
					//NPC坦克随机向不同方向移动
					tank.move();
					//NPC坦克随机发射炮弹
					if(random.nextInt(20) == 1) {
						b = tank.fire();						
						if(b != null)
							NPCbullets.add(b);
					}
				}
				Bullet bullet;
				TankNPC tank;
				for(int i=bullets.size()-1;i>=0;i--) {
					bullet=bullets.get(i);
					bullet.move();
					//判断玩家坦克的炮弹是否碰到边界或者碰到NPC坦克
					if(bullet.isClick(15, 38,WIDTH-15,HEIGHT-15)) {
						//如果碰到边界，添加一个爆炸动画
						//并且移除该炮弹
						animations.add(bullet.explore());
						bullets.remove(i);
					}else {
						//如果碰到NPC坦克，添加一个爆炸动画并且移除这个坦克
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

				//判断NPC坦克的炮弹是否碰到边界或者碰到玩家坦克
				for(int i=NPCbullets.size()-1;i>=0;i--) {
					bullet=NPCbullets.get(i);
					bullet.move();
					if(bullet.isClick(15, 38,WIDTH-15,HEIGHT-15)) {
						//如果碰到边界，添加一个爆炸动画
						//并且移除该炮弹
						animations.add(bullet.explore());
						NPCbullets.remove(i);
					}else if(bullet.isClick(mainTank)) {
						//如果碰到玩家坦克，添加一个爆炸动画
						//因为玩家坦克不是在一个Arraylist的数组里面，所以无法像NPC坦克一样直接移除
						//所以采取把玩家坦克位置设置到看不到的地方
						animations.add(mainTank.explore());
						mainTank.setX(-1000);
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
/*
 * 坦克可以发射炮弹，炮弹绘制在窗体上，按坦克的方向前进，以坦克两倍的速度移动。
 * 
 * */
