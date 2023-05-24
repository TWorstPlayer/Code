import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GameResource {
	private static GameResource instance;
	private Image img;
	private GameResource() {
		File f;
		f = new File("robots_sprite.png");
		try {
			img = ImageIO.read(f);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static GameResource getInstance() {
		if(instance == null)
			instance = new GameResource();
		return instance;
	}
	public Image getImage() {
		return img;
	}
	
	
}
