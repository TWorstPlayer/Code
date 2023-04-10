import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FrameCopy extends JFrame implements ActionListener {

    private TextField txt1;
    private TextField txt2;
    public FrameCopy(String str){
        super();
        this.setSize(500,200);
        this.setLayout(new GridLayout(1,3));
        JButton btn;


        txt1=new TextField(10);
        btn=new JButton("copy");
        txt2= new TextField(10);

        btn.addActionListener(this);//给这个按钮加上一个监听器

        this.add(txt1);
        this.add(btn);
        this.add(txt2);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txt2.setText(txt1.getText());
    }

}
