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
import java.util.ArrayList;

public class GameFrame extends JFrame  implements KeyListener {


    int i=0;
    private ArrayList<Tank> tanks=new ArrayList<Tank>();

    public GameFrame() {

        setTitle("坦克大战");
        setSize(500, 300);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        Tank tank1=new Tank();
        Tank tank2=new Tank();
        Tank tank3=new Tank();
        //style设置坦克样式，参数0为黄色，参数1为绿色，参数2为飞艇,同时设置位置
        tank1.style(0,50,100,tank1);
        tank2.style(1,100,100,tank2);
        tank3.style(2,150,100,tank3);
        tanks.add(tank1);
        tanks.add(tank2);
        tanks.add(tank3);


        this.addKeyListener(this);



       MyThread thread1 =new MyThread();
     //  MyThread thread2 =new MyThread();
     //  MyThread thread3 =new MyThread();
        thread1.start();


    }




    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,300);
        for(Tank tank:tanks) {
            tank.draw(g);
        }
    }

    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();
        int dir;
        switch(key) {
            case KeyEvent.VK_UP:     for(Tank tank:tanks) {tank.setDirecton(0);}break;
            case KeyEvent.VK_RIGHT:  for(Tank tank:tanks) {tank.setDirecton(1);}break;
            case KeyEvent.VK_DOWN:   for(Tank tank:tanks) {tank.setDirecton(2);}break;
            case KeyEvent.VK_LEFT:   for(Tank tank:tanks) {tank.setDirecton(3);}break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    private class MyThread extends Thread{

        @Override
        public void run() {
            // TODO Auto-generated method stub


            while(true) {
                for(Tank tank:tanks) {
                    //tanks.get(i).move();
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
