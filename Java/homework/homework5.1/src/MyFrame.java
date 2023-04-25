import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.awt.event.ItemListener;
import java.awt.event.ItemListener;
import java.util.Calendar;
public class MyFrame extends JFrame {
    Calendar calendar = Calendar.getInstance();




  //  static DayOfWeek week=date.getDayOfWeek();//week是DayOfWeek类型的，而我们需要的是int类型的
  //  static int weekDay=week.getValue();//所以这里使用getValue获得int值


  //  static JFrame frame =new JFrame();
    static JPanel Contentpanel= new JPanel();
    static JPanel Contentpanel1= new JPanel();
    static JTextArea text = new JTextArea();
    static JLabel Label1 = new JLabel();
    Font font =new Font("仿宋", Font.BOLD, 30);//设置一个字体的各种参数 字体-加黑-大小
    Font font1 =new Font("仿宋", Font.BOLD, 15);//设置一个字体的各种参数 字体-加黑-大小

    private JComboBox jcom = new JComboBox();
    private JComboBox jcom1 = new JComboBox();

    int year1;
    int month1;



    public MyFrame() {


        setSize(700,300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label1.setText("日历");
        Label1.setHorizontalAlignment(SwingConstants.CENTER);
        Label1.setFont(new Font("仿宋", Font.BOLD, 30));
     //   text.setLayout(null);
        text = new JTextArea();
        text.setFont(new Font("仿宋", Font.BOLD, 15));
        text.setBounds(200,100,450,300);
        text.setEditable(false);//使文本框只读
        JPanel Panel1=new JPanel();


        for(int i=2023;i>=1978;i--)
        {
            jcom.addItem(i);
        }

        for(int i=1;i<=12;i++)
        {
            jcom1.addItem(i);
        }
        jcom.setSelectedItem(calendar.get(Calendar.YEAR));//设置下拉菜单复选框默认选项
        jcom1.setSelectedItem(calendar.get(Calendar.MONTH));

        calendar cal = new calendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) ,text);
        cal.initCalendar();

        JPanel contentPanel = new JPanel(null);
        contentPanel.add(Panel1);
        contentPanel.add(Label1);


       // Panel1.setBounds(200,200,600,400);
        Label1.setBounds(0, 0, 500, 100);
        add(jcom);
        add(jcom1);
        jcom.setBounds(0,100,80,20);
        jcom1.setBounds(90,100,80,20);
        add(text);
        add(contentPanel);


        jcom1.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        int selectedValue = (int) jcom1.getSelectedItem();
        month1=selectedValue;
        calendar cal = new calendar(year1, month1,text);
        cal.initCalendar();
    }
});


        jcom.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                int selectedValue = (int) jcom.getSelectedItem();
                year1=selectedValue;
                calendar cal = new calendar(year1, 2,text);
                cal.initCalendar();
            }





    })


;}

}



//        text.setText(" Mon Tus Wed Thu Fri Sat Sun");
//        for (int i = 1; i < weekDay; i++)
//            text.setText("    ");
//        while (date.getMonthValue() == month) {
//            text.setColumns(date.getDayOfMonth());
//            if (date.getDayOfWeek().getValue() == 7)
//                text.setText("\n");
//            date = date.plusDays(1);
//        }
//        date = date.plusDays(1);
//    }



//     这个代码是 想用多线程去做，但是好像不行
//    public void run() {
//        text.setText(" Mon Tus Wed Thu Fri Sat Sun");
//        for (int i = 1; i < weekDay; i++)
//            text.setText("    ");
//        while (date.getMonthValue() == month) {
//            text.setColumns(date.getDayOfMonth());
//            if (date.getDayOfWeek().getValue() == 7)
//                text.setText("\n");
//            date = date.plusDays(1);
//        }
//        date = date.plusDays(1);
//    }

