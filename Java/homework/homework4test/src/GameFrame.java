import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{
    private ArrayList<Tank> tanks=new ArrayList<Tank>();
    public GameFrame() {
        Tank atank;

        setTitle("坦克大战");
        setSize(500,300);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i=0;i<5;i++) {
            atank = new Tank();
            atank.setLocation(100+i*100, 100);
            tanks.add(atank);
        }
        setVisible(true);
        this.addKeyListener(this);

        Thread gameThread = new Thread(new MyThread());
        gameThread.start();


    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,300);

        for(Tank tank:tanks) {
            tank.draw(g);
        }

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
        switch(key) {
            case KeyEvent.VK_UP:   dir = 0;break;
            case KeyEvent.VK_RIGHT:dir = 1;break;
            case KeyEvent.VK_DOWN: dir = 2;break;
            case KeyEvent.VK_LEFT: dir = 3;break;
        }
        for(Tank tank:tanks) {tank.setDirection(dir);}
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    private class MyThread implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while(true) {
//				for(int i=0;i<tanks.size();i++) {
//					atank = tanks.get(i);
//					atank.move();
//				}
                for(Tank tank:tanks) {
                    tank.move();
                }

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
