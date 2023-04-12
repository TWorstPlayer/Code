import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.awt.event.ItemListener;
import java.awt.event.ItemListener;
import java.time.Year;
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
    int year1=LocalDate.now().getYear();
    int month1=LocalDate.now().getMonthValue();




    public MyFrame() {

        setTitle("2022141461040_杨董");
        setSize(450,230);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //  setLayout(new GridLayout(2,1,0,0));
        Label1.setText("日历");
        Label1.setHorizontalAlignment(SwingConstants.CENTER);
        Label1.setFont(new Font("仿宋", Font.BOLD, 30));
        //   text.setLayout(null);
        text = new JTextArea();
        text.setFont(new Font("仿宋", Font.BOLD, 15));

        text.setEditable(false);//使文本框只读
        JPanel Panel1=new JPanel();


        for(int i=2023;i>=2013;i--)
        {
            jcom.addItem(i);
        }

        for(int i=1;i<=12;i++)
        {
            jcom1.addItem(i);
        }
        jcom.setSelectedItem(LocalDate.now().getYear());//设置下拉菜单复选框默认选项
        jcom1.setSelectedItem(LocalDate.now().getMonthValue());

        JPanel contentPanel = new JPanel(null);



        JLabel Label2=new JLabel("年");
        JLabel Label3=new JLabel("月");

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        panel1.add(Label2,BorderLayout.WEST);
        panel1.add(jcom,BorderLayout.EAST);
        panel2.add(Label3,BorderLayout.WEST);
        panel2.add(jcom1,BorderLayout.EAST);

        JPanel panel3=new JPanel();
        panel3.add(panel1,BorderLayout.WEST);
        panel3.add(panel2,BorderLayout.EAST);

        JPanel panel4=new JPanel();

        panel4.add(Label1);
        JPanel panel5=new JPanel();

        panel5.add(panel4,BorderLayout.NORTH);
        panel5.add(panel3,BorderLayout.SOUTH);
        add(panel5,BorderLayout.NORTH);
        add(text,BorderLayout.CENTER);

        initCalendar();

        jcom1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int selectedValue = (int) jcom1.getSelectedItem();
                month1=selectedValue;

                initCalendar();
            }
        });


        jcom.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                int selectedValue = (int) jcom.getSelectedItem();
                year1=selectedValue;

                initCalendar();
            }





        })


        ;}












    public void initCalendar() {
        LocalDate date;
        int weekDay;
        date = LocalDate.of(year1, month1, 1);
        int month=month1;
        weekDay = date.getDayOfWeek().getValue();
        int day=LocalDate.now().getDayOfMonth();
        text.setText("Mon\tTus\tWed\tThu\tFri\tSat\tSun\n");
        for (int i = 1; i < weekDay; i++) text.append("\t");
        while (date.getMonthValue() == month) {
            //  String a=String.format("%5s",String.valueOf(date.getDayOfMonth()));//不知道为什么用这个来实现对其不行
            if( date.getDayOfMonth() ==LocalDate.now().getDayOfMonth()&&date.getMonth()==LocalDate.now().getMonth()&&date.getYear()==LocalDate.now().getYear())
            {

                text.append("*");
                text.append("\t");
            }
            else{
                text.append(String.format("%d", date.getDayOfMonth()));//把int类型转为string类型
                text.append("\t");
            }
            if (date.getDayOfWeek().getValue() == 7) {
                text.append("\n");
            }
            date = date.plusDays(1);
        }

    }

}


