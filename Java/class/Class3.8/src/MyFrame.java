import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class MyFrame extends JFrame {
    private final int x=50;
    private int y=50;
    private  int flag=0;
    private Image img;
    public MyFrame()
    {


        setTitle("我的窗体");
        setSize(500,300);
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        repaint();
        setVisible(true);

        File f = new File("D:\\桌面\\资料\\程序设计基础\\代码\\Java\\class\\Class3.8\\robots_sprite.png");
        for(int i=0;i<100;i+=1) {
            try {
                img = ImageIO.read(f);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }



        for(int i=0;i<100;i+=1) {
           y=50+i;
            repaint();
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }

    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(0, 0, 500, 300);
        flag=(flag+1)%2;
        g.drawImage(img,x,y,x+34,y+34, flag * 34,0,flag*34+34,34,this);


    }

   /* public void paint1(Graphics g)
    {
        int w=20;
        int h=20;

        g.setColor(Color.black);
        g.fillRect(0, 0, 500, 300);
        g.setColor(Color.red);
        g.drawRect(x-w/2,y-h/2, w, h);
        g.drawRect(x-w/2+2, y-h/2+2, w-4, h-4);
        g.drawRect(x-1,y-28, 2, 28);
        g.drawRect(x-14,y-12, 4, 24);
        g.drawRect(x+10,y-12, 4, 24);
        flag=(flag+1)%2;

        for(int i=0;i<8;i++){
            g.drawLine(x-14,y-12+i*3+flag,x-10,y-12+i*3+flag);
            g.drawLine(x+10,y-12+i*3+flag,x+14,y-12+i*3+flag);
        }
    }*/


}
