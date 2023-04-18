import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Tank {
    private int x;
    protected int y;
    protected int imgX=0,imgY=0;
   // private int dir=0;//0 up 1 right 2 down 3 left
    private Direction direction=Direction.UP;
    protected Image img;
    protected int flag=0;
    public int getX() { return x;}
    public Tank(int ax,int ay) {
        File f;
        f = new File("D:\\桌面\\code\\Java\\homework\\homework6\\robots_sprite.png");
        try {
            img = ImageIO.read(f);
        } catch (IOException e1) {  //错误警告，如果没读到文件
            e1.printStackTrace();   //那么就会打印出错误原因
        }
        x = ax;
        y = ay;

    }
  /*  public void setDirection(int adir) {
        dir = adir;
        imgX = dir*68;

    }*/
    public void setDirection(Direction direction) {
        this.direction=direction;
        imgX = direction.getI()*68;

    }

    public void move() {

        switch(direction.getI()) {
            case 0: y -= 2;break;
            case 1: x += 2;break;
            case 2: y += 2;break;
            case 3: x -= 2;break;
        }
    }

    public void draw(Graphics g) {
        flag = (flag+1)%2;
        if(flag == 0)
            g.drawImage(img, x, y, x+34, y+34, imgX, imgY, imgX+34, imgY+34,null);
        else
            g.drawImage(img, x, y, x+34, y+34, imgX+34, imgY, imgX+68, imgY+34,null);
    }
}