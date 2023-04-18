import java.util.Locale;
import java.util.Scanner;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Mainclass {
    public static void main(String[] args) {
        Size size;
        size =Size.SMALL;
        Scanner input =new Scanner(System.in);
        String str=input.next().toUpperCase();   //toUpperCase 把读入的字符串全部变为大写
        String str1=input.next().toLowerCase();   //toUpperCase 把读入的字符串全部变为小写


        size =Enum.valueOf(Size.class,str);//Enum.valueOf 这个是一个类方法，可以直接通过Enum这个类名去访问这个方法
                                           //这个方法用于把后面的字符串转换为Size类型的枚举变量
        //在 Java 中，Class 对象表示一个类或接口的类型。在这里，Size.class 表示 Size 枚举类型对应的 Class 对象，
        // 通过这个 Class 对象，可以获取 Size 的一些元数据信息，例如：类名、枚举常量名、枚举常量值等。
        // 在代码中，Enum.valueOf(Size.class, str) 方法中的 Size.class 表示要将 str 字符串转换为 Size 枚举类型的枚举常量。
        System.out.println("out: "+size);
      //  System.out.println(ClassA.count);

        System.out.println("ordinal:"+size.ordinal());
        System.out.println("ordinal:"+size.getStr());
        System.out.println("ordinal:"+size.getd());

    }
}