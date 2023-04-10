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

public class GameFrame extends JFrame implements KeyListener {



    private Tank tank;
    public GameFrame() {

        tank = new Tank();
        setTitle("坦克大战");
        setSize(500, 300);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);


        this.addKeyListener(this);
        tank.setLocation(50, 100);


        while (true) {
            tank.move();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }




    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,300);
        tank.draw(g);
    }

    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();
        switch(key) {
            case KeyEvent.VK_UP:    tank.setDirecton(0);break;
            case KeyEvent.VK_RIGHT: tank.setDirecton(1) ;break;
            case KeyEvent.VK_DOWN:  tank.setDirecton(2); break;
            case KeyEvent.VK_LEFT:  tank.setDirecton(3);break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
