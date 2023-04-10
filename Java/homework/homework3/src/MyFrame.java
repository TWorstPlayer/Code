import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements KeyListener{
    private int x;
    private int y;
    private int dir=0;//0 up 1 right 2 down 3 left
    private Image img;
    private int flag=0;
    int locatx=0;

    public MyFrame() {
        setTitle("我的窗体");
        setSize(500,300);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.addKeyListener(this);
        x = 50;
        y = 50;



        File f = new File("D:\\桌面\\资料\\程序设计基础\\代码\\Java\\homework\\homework3\\robots_sprite.png");

        try {
            img = ImageIO.read(f);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        for(int i=0;i<10000;i+=1) {
            switch(dir) {
                case 0:
                    locatx=0;
                    y -= 2;
                    break;
                case 1:
                    locatx=68;
                    x += 2;
                    break;
                case 2:
                    locatx=68+68;
                    y += 2;
                break;
                case 3:
                    locatx=68+68+68;
                    x -= 2;
                    break;
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
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,300);
        flag = (flag+1)%2;
        g.drawImage(img, x, y, x+34, y+34, locatx+flag*34, 0, flag*34+34+locatx,34, this);
        g.drawImage(img, x+50, y, x+34+50, y+34, locatx+flag*34, 0, flag*34+34+locatx,34, this);
        g.drawImage(img, x+100, y, x+34+100, y+34, locatx+flag*34, 0, flag*34+34+locatx,34, this);
        g.drawImage(img, x+150, y, x+34+150, y+34, locatx+flag*34, 0, flag*34+34+locatx,34, this);
        g.drawImage(img, x+200, y, x+34+200, y+34, locatx+flag*34, 0, flag*34+34+locatx,34, this);

        //g.drawImage(img, x2, y2, x2+34, y2+34, 68+flag*34, 0, flag*34+102,34, this);

    }
   /* public void paint1(Graphics g) {
        int w=20;
        int h = 20;
        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,300);
        g.setColor(Color.RED);
        g.drawRect(x-w/2, y-h/2, w, h);
        g.drawOval(x-w/2+2, y-h/2+2, w-4, h-4);
        g.drawRect(x-1, y-28, 2, 28);
        g.drawRect(x-14, y-12, 4, 24);
        g.drawRect(x+10, y-12, 4, 24);
        flag = (flag+1)%2;
        for(int i=0;i<8;i++) {
            g.drawLine(x-14, y-12+i*3+flag, x-10, y-12+i*3+flag);
            g.drawLine(x+10, y-12+i*3+flag, x+14, y-12+i*3+flag);
        }


    }*/
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();
        switch(key) {
            case KeyEvent.VK_UP: dir = 0;break;
            case KeyEvent.VK_RIGHT: dir = 1;break;
            case KeyEvent.VK_DOWN: dir = 2; break;
            case KeyEvent.VK_LEFT: dir = 3;break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
