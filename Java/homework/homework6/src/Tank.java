import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Tank {
    private int x;
    protected int y;
    protected int imgX=0,imgY=0;
    private int dir=0;//0 up 1 right 2 down 3 left
    protected Image img;
    protected int flag=0;
    public int getX() { return x;}
    public Tank(int ax,int ay) {
        File f;
        f = new File("robots_sprite.png");
        try {
            img = ImageIO.read(f);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        x = ax;
        y = ay;

    }
    public void setDirection(int adir) {
        dir = adir;
        imgX = dir*68;

    }

    public void move() {

        switch(dir) {
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