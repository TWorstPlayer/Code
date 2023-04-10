import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTest {

    public static void main(String[] args) {
        String str;
        LocalDate date = LocalDate.now(); //LocatDate.of(2012,3,15);得到指定的日期对象
        int year=date.getYear();//转换为int类型的year。
        int month=date.getMonthValue();
        int day=date.getDayOfMonth();

//        LocalDate date1=LocalDate.now();
//        int day1=date1.getDayOfMonth();

        DayOfWeek week=date.getDayOfWeek();//week是DayOfWeek类型的，而我们需要的是int类型的
        int weekDay=week.getValue();//所以这里使用getValue获得int值

//        System.out.printf("%d-%d-%d 星期%d",year,month,day,weekDay);
//
//        date=date.minusDays(1);//减一天
//        date=date.plusDays(1);//加一天
//        weekDay =date.getDayOfWeek().getValue();

        date =date.minusDays(day-1);//minus->表示减去多少天
        System.out.println(" Mon Tus Wed Thu Fri Sat Sun");
        for(int i=1;i<weekDay;i++)
            System.out.print("    ");
        while(date.getMonthValue()==month)//只输出3月份的
        {
            if(date.getDayOfMonth()==day)
            {
                System.out.printf("   *");
            }
            else
            {
                System.out.printf("%4d",date.getDayOfMonth());
            }
            if(date.getDayOfWeek().getValue()==7)
                System.out.println();
            date=date.plusDays(1);
        }






      //  System.out.println(year+'-'+month+'-'+day+" "+weekDay);
       // System.out.println(year);
    }
}
