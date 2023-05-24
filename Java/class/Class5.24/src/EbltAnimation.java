import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EbltAnimation extends Animation {	
	public EbltAnimation(int ax,int ay) {
		super(ax,ay,4);
		imgX = 34*16;
		imgY = 34*4;		
	}	
}
