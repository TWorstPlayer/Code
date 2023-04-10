import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class FrameMouse extends JFrame implements MouseListener, MouseMotionListener {
    private int x1,y1;
    private int x2,y2;
    private ArrayList<Point> points =new ArrayList<Point>();

    public FrameMouse(String str){
        super();
        this.setSize(500,200);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        for (int i=0;i<points.size();i+=2){
            x1=(int)points.get(i).getX();
            y1=(int)points.get(i).getY();
            x2=(int)points.get(i+1).getX();
            y2=(int)points.get(i+1).getY();
            g.drawLine(x1,y1,x2,y2);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    x1=e.getX();
    y1=e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    points.add(new Point(x1,y1));
    points.add(new Point(x2,y2));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x2=e.getX();
        y2=e.getY();
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

