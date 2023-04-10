import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class calendar  {


    private int year;
    private int month;
    private LocalDate date;
    private int weekDay;
    static JTextArea text = new JTextArea();

    public calendar(int year, int month, JTextArea text) {
        this.year = year;
        this.month = month;
        this.text = text;
        this.date = LocalDate.of(year, month, 1);
        this.weekDay = date.getDayOfWeek().getValue();
    }
    public void initCalendar() {

        text.setText("Mon\tTus\tWed\tThu\tFri\tSat\tSun\n");
        for (int i = 1; i < weekDay; i++) text.append("\t");
        while (date.getMonthValue() == month) {
            // String a=String.format("%5s",String.valueOf(date.getDayOfMonth()));//不知道为什么用这个来实现对其不行
            text.append(String.format("%d", date.getDayOfMonth()));//把int类型转为string类型
            text.append("\t");
            if (date.getDayOfWeek().getValue() == 7) {
                text.append("\n");
            }
            date = date.plusDays(1);
        }

    }

}