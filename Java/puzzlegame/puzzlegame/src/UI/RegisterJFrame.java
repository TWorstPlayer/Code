package UI;

import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame()
    {
        this.setSize(488,500);
        this.setTitle("拼图 登录");
        this.setVisible(true);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

    }
}
