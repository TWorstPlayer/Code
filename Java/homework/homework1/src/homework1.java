import javax.swing.*;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.*;
import java.awt.*;


public class homework1 {


    public static void main(String[] args) {

        //组件的预设

        JFrame frame= new JFrame("新建java项目");



        JLabel label1=new JLabel("创建Java项目");
        label1.setFont(new Font("微软雅黑", Font.BOLD, 23));//设置字的字体，大小
        JLabel label2=new JLabel("输入项目名。");
        label1.setFont(new Font("微软雅黑", Font.BOLD,15));



        JLabel label3=new JLabel("项目名(p):");
        JTextField jtf1=new JTextField();
        jtf1.setColumns(5);

        JLabel label4=new JLabel("位置(L):");
        label4.setForeground(Color.GRAY);
        JTextField jtf2=new JTextField();
        jtf2.setEditable(false);
        jtf2.setDisabledTextColor(Color.GRAY );//设置文本框不可用的时候的颜色
        jtf2.setText("D:\\Java work");
        jtf1.setColumns(15);




        Checkbox cbox1=new Checkbox("使用缺省位置(D)");



        Checkbox cbox2=new Checkbox("JRE(V)",true);//其中一个选项
        Checkbox cbox3=new Checkbox("使用特定于项目的JRE",true);//其中一个选项

        Choice choice =new Choice();
        choice.add("JavaSE-19");
        choice.add("JavaSE-17");
        choice.add("JavaSE-15");

        java.awt.List list1 = new java.awt.List(2,true);
        list1.add("创建java项目");
        list1.add("输入项目名");

        //设计边框后面用
        Border border1=BorderFactory.createLineBorder(Color.BLACK);//设计边框
        Border border2= BorderFactory.createTitledBorder(border1,"JRE", TitledBorder.LEFT,TitledBorder.CENTER);//设计边框,这是边框标题,然后是标题的位置//这个是黑线带标题边框
      //  Border border3= BorderFactory.createLineBorder(Color.BLACK,1);
        Border border4= BorderFactory.createEmptyBorder(15,15,10,15);//透明边框
        Border border5= BorderFactory.createEmptyBorder(10,15,5,15);//透明边框







        //开始安装组件并确定位置

        Box box0=Box.createVerticalBox();
        box0.add(Box.createVerticalStrut(15));
        box0.add(label1);
        box0.add(Box.createVerticalStrut(20));

        box0.add(label2);

        box0.add(Box.createVerticalStrut(4));
        box0.setBorder(border5);


        GridLayout gri0=new GridLayout(4,1);//设置GridLayout这个布局器

        frame.setLayout(gri0);//使我们的窗口去使用这个布局器
        frame.add(box0);



        Box box01=Box.createHorizontalBox();
        box01.add(label3);
        box01.add(jtf1);




        Box box1=Box.createVerticalBox();
        box1.add(cbox1);

        Box box001=Box.createHorizontalBox();
        box001.add(label4);
        box001.add(jtf2);
        box001.add(Box.createVerticalStrut(10));


        Box box010 =Box.createVerticalBox();
        box010.setBorder(border4);//设置边框
        box010.add(box01);
        box010.add(box1);
        box010.add(box001);


        frame.add(box010);




        Box box2= Box.createHorizontalBox();
        box2.add(cbox2);
        box2.add(choice);

        Box box3=Box.createHorizontalBox();
        box3.add(cbox3);

        JPanel panel1=new JPanel();//设置一个容器
        panel1.setSize(200,200);
        panel1.add(box2,BorderLayout.NORTH);
        panel1.add(box3,BorderLayout.SOUTH);


        panel1.setBorder(border2);//给它加上边框
        frame.add(panel1);


        Box box4=Box.createHorizontalBox();
        box4.add(Box.createVerticalStrut(60));//空白
        box4.add(Box.createHorizontalStrut(20));//空白


        Box box5=Box.createHorizontalBox();
        box5.add(Box.createVerticalStrut(10));
        box5.add(new Button("上一步(B)"));
        box5.add(Box.createHorizontalStrut(4));//空白

        box5.add(new Button("下一步(N)"));
        box5.add(Box.createHorizontalStrut(4));//空白
        box5.add(new Button("完成"));

        box5.add(Box.createHorizontalStrut(4));//空白
        box5.add(new Button("取消"));
        box5.add(Box.createHorizontalStrut(4));//空白

        Box box6=Box.createVerticalBox();
        box6.add(box4);
        box6.add(box5);

        frame.add(box6);




        frame.pack();//使frame用合适的大小显示。
        frame.setVisible(true);







    }
}
