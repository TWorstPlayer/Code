import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class JMyPanel extends JPanel{


    public void paint(Graphics g) {
       g.setColor(Color.BLACK);
       g.fillRect(0,0,500,300);
    }
}
