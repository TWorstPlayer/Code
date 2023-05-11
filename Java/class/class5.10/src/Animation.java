import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Animation {
    private int COUNT=4;
    private int x;
    protected int y;
    protected int imgX,imgY;
    private  int frame=0;
    private static Image img;


    public Animation(int ax, int ay ,int acount){
        x=ax;
        y = ay;
        COUNT=acount;
   /*
        imgX=34*16;
        imgY=34*4;*/
        File f;

        f = new File("D:\\robots_sprite.png");
        try {
            img = ImageIO.read(f);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    public void draw(Graphics g) {

        g.drawImage(img, x-17, y-17, x+17, y+17, imgX+frame*34, imgY, imgX+34+frame*34, imgY+34,null);
        frame++;


    }
    public boolean isVisible(){
        return frame<COUNT;
    }
}
