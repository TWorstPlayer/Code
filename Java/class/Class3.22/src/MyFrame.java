import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;



public class MyFrame extends JFrame implements ActionListener {
    public MyFrame(){
        super("my frame");//调用父类的函数
        this.setSize(500,300);
        //添加菜单
        JMenuBar menuBar=new JMenuBar();
        //文件菜单


        JMenu fileMenu=new JMenu("File");
        //快捷键
        fileMenu.setMnemonic('F');
        JMenu editMenu=new JMenu("Edit");
        JRadioButtonMenuItem fontItem1=new JRadioButtonMenuItem("宋体");
        JRadioButtonMenuItem fontItem2=new JRadioButtonMenuItem("楷体");
        ButtonGroup fontGroup =new ButtonGroup();
        fontItem1.setSelected(true);//使下面的选项互斥
        fontGroup.add(fontItem1);//选项
        fontGroup.add(fontItem2);

        editMenu.add(fontItem1);
        editMenu.add(fontItem2);
        editMenu.addSeparator();
        JCheckBoxMenuItem boldItem =new JCheckBoxMenuItem("加粗");
        editMenu.add(boldItem);


        JMenu helpMenu=new JMenu("Help");
        JMenu xinjianMenu=new JMenu("新建");

        JMenuItem ceItem=new JMenuItem("close editor");
        JMenuItem printItem=new JMenuItem("Print");
        printItem.addActionListener(this);
        JMenuItem saveItem=new JMenuItem("save");
        saveItem.addActionListener(this);//加一个监听器
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));//设置快捷键

        fileMenu.add(xinjianMenu);//菜单的嵌套
        fileMenu.add(ceItem);
        fileMenu.addSeparator();//加上一个横线
        fileMenu.add(printItem);
        fileMenu.addSeparator();
        fileMenu.add(saveItem);



        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

      //  this.add(fileMenu);
        this.setJMenuBar(menuBar);
        JMyPanel panel=new JMyPanel();
        //panel.setBackground(Color.BLACK);
       this.setContentPane(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

        public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(this,"hello!!");
        }

  /*  @Override
    public void paint(Graphics g) {
       g.setColor(Color.BLACK);
       g.fillRect(50,100,500,300);
    }*/
}
