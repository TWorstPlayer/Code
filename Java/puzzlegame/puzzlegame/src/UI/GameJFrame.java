package UI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {

    //创建一个二维数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data =new int[4][4];
    public GameJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();



        //初始化图片，（根据打乱之后的结果去加载图片）
        initImage();

        //设置窗体可见，一般都放在最后
        this.setVisible(true);
    }

    //初始化数据（打乱）
    private void initData() {
        //1. 定义一个一维数组
        int [] tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,};
        //2.打乱数组中的数组的顺序
        //遍历数组，将每一个元素，和随机索引上的数据进行交换
        Random r=new Random();
        for(int i=0;i<tempArr.length;i++){
            int index=r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，和随机索引上的数据交换
            int temp=tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;

        }


        //5.给二维数组添加数据
        int index=0;
        for(int i=0;i< data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j]=tempArr[index];
                index++;
            }
        }

    }

    //初始化图片
    //添加图片的时候，就需要按照二维数组中管理的数据天机图片
    private void initImage() {
      /*  //创建一个图片ImageIcon的对象
        ImageIcon icon =new ImageIcon("D:\\桌面\\code\\Java\\puzzlegame\\puzzlegame\\image\\animal\\animal1\\3.jpg");
        //创建一个JLabel的对象（管理容器）
        JLabel jLable =new JLabel(icon);
        //指定图片的位置
        jLable.setBounds(0,0,105,105);

        //把管理容器添加到界面中
        this.add(jLable);*/
        int number =1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++) {
                //获取当前要加载图片的序号
                int num=data[i][j];
                //创建一个图片ImageIcon的对象
                JLabel jLabel = new JLabel(new ImageIcon("D:\\桌面\\code\\Java\\puzzlegame\\puzzlegame\\image\\animal\\animal1\\"+num+".jpg"));
                //指定图片位置
                jLabel.setBounds(109 * i, 105 * j, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(1));

                //把管理容器添加到界面中
                this.add(jLabel);

            }
        }


    }


    private void initJMenuBar() {

        //创建整个的菜单对象
        JMenuBar JMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象（功能 关于我们）
        JMenu funcationJMenu =new JMenu("功能");
        JMenu aboutJMenu =new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem =new JMenuItem("重新游戏");
        JMenuItem reLoginItem =new JMenuItem("重新登录");
        JMenuItem closeItem =new JMenuItem("关闭游戏");

        JMenuItem accountItem =new JMenuItem("公众号");

        //将每一个选项下面的条目添加到选项当中
        funcationJMenu.add(replayItem);
        funcationJMenu.add(reLoginItem);
        funcationJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将菜单里面的两个选项添加到菜单当中
        JMenuBar.add(funcationJMenu);
        JMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(JMenuBar);
    }


    private void initJFrame() {
        //设置窗体大小
        this.setSize(603,688);
        //设置窗体标题
        this.setTitle("拼图游戏单机版 V1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //取消默认居中方式
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
