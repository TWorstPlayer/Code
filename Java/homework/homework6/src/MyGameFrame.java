import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import javax.swing.JFrame;



public class MyGameFrame extends JFrame implements KeyListener{
    private Tank mainTank;       //玩家坦克 1 个
    public MyGameFrame(){

        setTitle("坦克大战");
        setSize(500,300);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainTank = new Tank(100,100);
        setVisible(true);
        this.addKeyListener(this);
        Thread thread = new Thread(new GameThread());
        thread.start();

    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 300);
        mainTank.draw(g);
    }



    @Override

    public void keyPressed(KeyEvent e) {
        int key;
        key = e.getKeyCode();
        switch(key){
            case KeyEvent.VK_UP:mainTank.setDirection(0);break;
            case KeyEvent.VK_RIGHT:mainTank.setDirection(1);break;
            case KeyEvent.VK_DOWN:mainTank.setDirection(2);break;
            case KeyEvent.VK_LEFT:mainTank.setDirection(3);break;
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {}
    @Override
    public void keyTyped(KeyEvent arg0) {}

    private class GameThread implements Runnable{
        @Override
        public void run() {
            while(true) {
                mainTank.move();
                repaint();
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}