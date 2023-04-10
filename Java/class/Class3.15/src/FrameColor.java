import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FrameColor extends JFrame {
    public FrameColor(String str){
        super();
        this.setSize(500,500);
        this.setLayout(null);
        JButton btn1=new JButton("red");
        btn1.setLocation(50,50);
        btn1.setSize(100,50);
        BtnRedListener l1=new BtnRedListener(this,Color.red);
        btn1.addActionListener(l1);

        JButton btn2=new JButton("blue");
        btn2.setLocation(200,50);
        btn2.setSize(100,50);
        BtnRedListener l2=new BtnRedListener(this,Color.BLUE);
        btn2.addActionListener(l2);

        JButton btn3=new JButton("green");
        btn3.setLocation(350,50);
        btn3.setSize(100,50);
        BtnRedListener l3=new BtnRedListener(this,Color.green);
      //  l3.setFrame(this);
        btn3.addActionListener(l3);

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);

        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setVisible(true);
    }
}
