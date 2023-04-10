import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class MyFrame extends JFrame {
    private int x1=50;
    private int y1=100;
    private int x2=50;
    private int y2=50;
    private int x3=200;
    private int y3=50;
    private int x4=200;
    private int y4=230;

    private  int flag=0;
    private Image img1;
    private Image img2;
    private Image img3;
    private Image img4;
    public MyFrame()
    {


        setTitle("我的窗体");
        setSize(600,600);
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        repaint();
        setVisible(true);

        File f = new File("D:\\桌面\\资料\\程序设计基础\\代码\\Java\\homework\\homework2\\robots_sprite.png");


            try {
                img1 = ImageIO.read(f);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            try {
            img2 = ImageIO.read(f);
             } catch (IOException e1) {
            e1.printStackTrace();
             }
            try {
            img3 = ImageIO.read(f);
            } catch (IOException e1) {
            e1.printStackTrace();
             }
            try {
            img4 = ImageIO.read(f);
            } catch (IOException e1) {
            e1.printStackTrace();
             }




        for(int i=0;i<150;i+=1) {
            y1=200-i;
            x2=50+i;
            y3=50+i;
            x4=200-i;
            repaint();
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }

    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(0, 0, 600, 600);
        flag=(flag+1)%2;
         g.drawImage(img1,x1+150,y1+3,x1+34+150,y1+34+3,0+flag*34,0,flag*34+34,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标
         g.drawImage(img2,x2+184,y2+180,x2+34+184,y2+34+180,68+flag*34,0,flag*34+102,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标
         g.drawImage(img3,x3,y3+200,x3+34,y3+34+200,136+flag*34,0,flag*34+170,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标
        g.drawImage(img4,x4-34,y4,x4+34-34,y4+34,204+flag*34,0,flag*34+238,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标


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



/*import javax.imageio.ImageIO;
        import javax.swing.*;
        import java.awt.*;
        import java.io.File;
        import java.io.IOException;


public class MyFrame extends JFrame {
    private int x1=50;
    private int y1=100;
    private int x2=50;
    private int y2=50;
    private int x3=200;
    private int y3=50;
    private int x4=200;
    private int y4=200;

    private  int flag=0;
    private Image img1;
    private Image img2;
    private Image img3;
    private Image img4;
    public MyFrame()
    {


        setTitle("我的窗体");
        setSize(500,300);
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        repaint();
        setVisible(true);

        File f = new File("robots_sprite.png");


        try {
            img1 = ImageIO.read(f);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try {
            img2 = ImageIO.read(f);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            img3 = ImageIO.read(f);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            img4 = ImageIO.read(f);
        } catch (IOException e1) {
            e1.printStackTrace();
        }




        for(int i=0;i<150;i+=1) {
            y1=200-i;
            x2=50+i;
            y3=50+i;
            x4=200-i;
            repaint();
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }

    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(0, 0, 500, 300);
        flag=(flag+1)%2;
        g.drawImage(img1,x1,y1,x1+34,y1+34,0+flag*34,0,flag*34+34,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标
        g.drawImage(img2,x2,y2,x2+34,y2+34,68+flag*34,0,flag*34+102,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标
        g.drawImage(img3,x3,y3,x3+34,y3+34,136+flag*34,0,flag*34+170,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标
        g.drawImage(img4,x4,y4,x4+34,y4+34,204+flag*34,0,flag*34+238,34,this);//sx1 和sx2是第一个角的坐标， sx2和sy2是第二个角的坐标


    }




}*/
