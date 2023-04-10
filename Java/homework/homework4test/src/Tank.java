import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tank {
    private int x;
    private int y;
    private int dir=0;//0 up 1 right 2 down 3 left
    private Image img;
    private int flag=0;
    private int category;

    public Tank() {
        File f = new File("D:\\桌面\\资料\\程序设计基础\\代码\\Java\\class\\homework4test\\robots_sprite.png");
        try {
            img = ImageIO.read(f);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
    public void setLocation(int ax,int ay) {
        x = ax;
        y = ay;
    }
    public void setDirection(int adir) {dir = adir;}
    public void move() {
        switch(dir) {
            case 0:	y -= 2;break;
            case 1: x += 2;break;
            case 2: y += 2;break;
            case 3: x -= 2;break;
        }
    }
    public void draw(Graphics g) {
        flag = (flag+1)%2;
        g.drawImage(img, x, y, x+34, y+34, dir*68+flag*34, 0, flag*34+34+dir*68,34, null);
    }

}
