import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;

public class StringFrame extends JFrame implements ActionListener{

    private JTextField txtSearch;
    private JTextField txtReplace;
    private JButton btnSearch;
    private JButton btnReplace;
    private JButton btnParse;
    private JButton btnReset;
    JTextArea txtContent;
    static int findbegin=0;
    static String stringcompare;
    String strContent =
            "goodsA-9.5-100\n"+
            "goodsB-10.3-110\n"+
            "goodsC-23.1-80\n"+
            "goodsD-15.5-90\n"+
            "goodsE-18.5-70\n"+
            "goodsA-9.5-100\n"+
            "goodsB-10.3-110\n"+
            "goodsC-23.1-80\n"+
            "goodsD-15.5-90\n"+
            "goodsE-18.5-70\n";

    public StringFrame() {
        super("作业：字符串分析");
        setSize(600,500);//设置窗体的宽和高
        setLayout(new BorderLayout());//使用绝对位置布局，不用布局管理器

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,4));
        northPanel.add(new JLabel("查找:",SwingConstants.RIGHT));//将标签组件添加到窗体上

        txtSearch = new JTextField(20);
        northPanel.add(txtSearch);

        btnSearch = new JButton("查找下一个");
        northPanel.add(btnSearch);
        btnSearch.addActionListener(this);
        btnParse = new JButton("解析文本内容");
        btnParse.addActionListener(this);
        northPanel.add(btnParse);
        northPanel.add(new JLabel("替换:",SwingConstants.RIGHT));//将标签组件添加到窗体上
        txtReplace= new JTextField(20);
        northPanel.add(txtReplace);
        btnReplace = new JButton("替换");
        btnReplace.addActionListener(this);
        northPanel.add(btnReplace);
        btnReset = new JButton("重置内容");
        btnReset.addActionListener(this);
        northPanel.add(btnReset);
        add(northPanel,BorderLayout.NORTH);
        txtContent = new JTextArea(strContent,100,50);
        JScrollPane scrollPane = new JScrollPane(txtContent);
        add(scrollPane,BorderLayout.CENTER);
        txtContent.setCaret(new DefaultCaret() {
            public void setSelectionVisible(boolean visible)
            {
                super.setSelectionVisible(true);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }



    @Override
    //在上面定义了两个静态变量
    //static int findbegin=0;
    //static String stringcompare;
    //
    public void actionPerformed(ActionEvent e) {

        //如果查询的字符串和上次的不一样，findbegin=-1，代表重新从头开始查找
        if(stringcompare!=null) {
            if (!stringcompare.equals(txtSearch.getText())) {
                findbegin = -1;
            }
        }
        //int findIndex = -1;没想到这个咋用

        String string1= txtSearch.getText();
        int begin=strContent.indexOf(string1,findbegin);//这个findbegin是用来计数
        int end =begin+string1.length();

        JButton btn = (JButton)e.getSource();

        if(btn == btnReset) {

            txtContent.setText(strContent);


        }else if(btn == btnParse) {
            //拆分为每一条
            String[] Parse1=strContent.split("\n");
            //每一条再拆分
            String[][] Parse2=new String[Parse1.length][];
            for(int i=0;i< Parse1.length;i++)Parse2[i]=Parse1[i].split("-");
            //处理数据
            //先找一下一共有多少种商品
            String[] arrgood=new String[Parse1.length];
            for(int i=0;i<Parse1.length;i++)
            {
               arrgood[i]=Parse2[i][0];
            }
            Arrays.sort(arrgood);

            int count1=0;
            for(int i=1;i<arrgood.length;i++)
            {
                if(!arrgood[i].equals(arrgood[i-1]))count1++;
            }
            if(count1!=0)count1++;
            //上面找到有多少个商品
            Object[][] arr=new Object[count1][3];
            arr[0][0]=arrgood[0];
            for(int i=1,j=0;i<arrgood.length;i++)
            {
                if(arrgood[i].equals(arrgood[i-1]))continue;
                else arr[++j][0]=arrgood[i];
            }

            for(int i=0;i<count1;i++)
            {
                for(int j=0;j<arrgood.length;j++)
                {
                    if(arr[i][0].equals(Parse2[j][0]))
                    {
                        if(arr[i][1]==null)
                        {
                            arr[i][1]=Double.valueOf(Parse2[j][1]);
                            arr[i][2]=Integer.valueOf(Parse2[j][2]);
                        }
                        else {
                            arr[i][2] = (int) arr[i][2] + Integer.valueOf(Parse2[j][2]);
                        }
                    }

                }
            }
            txtContent.append("         品名\t价格\t数量");
            txtContent.append("\n");
            for(int i=0;i<count1;i++)txtContent.append("         "+arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\n");



        }else if(btn == btnSearch) {

        if (begin != -1) {
                txtContent.setSelectionStart(begin);
                txtContent.setSelectionEnd(end);
                txtContent.requestFocus(true);
                findbegin =end;
                stringcompare=txtSearch.getText();
            }
        else{
            txtContent.setSelectionStart(0);
            txtContent.setSelectionEnd(0);
            txtContent.requestFocus(false);
        }




        }else if(btn == btnReplace) {
            if(findbegin!=-1) {
                String stringreplace = txtReplace.getText();
                txtContent.replaceSelection(stringreplace);
                txtContent.setSelectionStart(findbegin - stringcompare.length());
                txtContent.setSelectionEnd(findbegin - stringcompare.length() + stringreplace.length());
                txtContent.requestFocus(true);
                findbegin = findbegin - stringcompare.length() + stringreplace.length();
            }


        }

    }



    public static void main(String[] args) {

        new StringFrame();

    }

}