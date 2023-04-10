import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnRedListener implements ActionListener {
   private JFrame frame;
   private Color color;
   public BtnRedListener(JFrame fr,Color c){
       frame=fr;
       color=c;


   }
    @Override
    public void actionPerformed(ActionEvent e) {
       frame.getContentPane().setBackground(color);

    }

}
