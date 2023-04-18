//public class Mainclass {
//
//    public static void main(String[] args) {
////        tech1 abc=new tech1("213123",1,2);
////        tech1 abc1=new tech1("213123",2,2);
////
////        abc.input++;
////        System.out.println(abc.input);
////        System.out.println(abc1.input);
//
//        tech1 abc =new tech1("323123",2);
//
//        tech1 abcd =new tech1("sdhakdhasjk",3);
//       // System.out.println(abc.input);
//        System.out.println(abc);
//        System.out.println(abcd);
//     //   System.out.println(panduan());//类方法只能调用类方法，类方法是无法调用实例方法的
//
//
//        System.out.println(panduan(1));//这两种都可以调用panduan这个类方法，原因是如果两个类方法是同一个类的，就不用在前面加类名，
//                                           //就可以直接通过方法名调用
//        System.out.println(Mainclass.panduan(1));
//        abc.input=4;
//    }
//    public static boolean panduan(int Y)//类方法，可通过类或者实例来调用
//    {
//        return true;
//
//    }
//    public  boolean panduan()//实例方法，只能通过实例来调用
//
//    {
//        return true;
//
//    }
//
//
//
//}



//public class Mainclass {
//
//    private static int counter;//这是一个类变量
//    private int id;
//    static {                        //这是一个类初始化器或者叫静态初始化器，当这个类被某种方式第一次使用的时候，这个类的类初始化器就执行完毕
//                                    //注意：类初始化器中不可有有return语句，同时也不能使用this和super语句
//        Random rand =new Random();
//        counter =rand.nextInt(10)*100;
//      //  return;
//    }
//
//}

//import java.util.Scanner;
//import static java.lang.Math.abs;//静态引入声明——>可引入静态字段或者静态方法，例如圆周率PI
//                                //通过引入静态方法，就可以不通过包名去用静态方法，就可以直接使用静态方法，如下a=abs(a),直接使用了abs这个静态方法
//public class Mainclass {
//    public static void main(String[] args) {
//        tech1 tech =new tech1();
//        tech1 tech3 =new tech1();
//        java.util.Scanner input =new Scanner(System.in);
//        int a=0;
//        a=input.nextByte();//读取一个Byte类型的数据  byle范围从 -128--127
//        System.out.println(a);
//        a=Math.abs(a);
//        a=abs(a);
//    }
//}

//
//public class Mainclass {
//
//
//    public static void sqr(tech1 a)
//    {
//        System.out.println(a.getName());
//    }
//    public static void main(String[] args) {
//        tech1 tech2=new tech1("张山0");
//        sqr(tech2);
//    }
//}



//class Point2d{
//    int x;
//    int y;

//    Point2d(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//Point2d(){
//
//}
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    void printf(){
//    System.out.println(123);
//    }
//}
//
//class Point3D extends Point2d{
//    int x;
//    int z;
//    Point3D(int x,int y,int z)
//    {
//        System.out.println(this.x);//由这里可以看出，如果不调用super的话，确实是会先调用父类的一个不接收参数的构造函数
//        System.out.println(this.y);
//      this.x=x;
//      this.y=y;
//        System.out.println(this.x);
//        System.out.println(this.y);
//       // super(x,y);//supen语句必须是子类构造函数里的第一条语句
//        this.z=z;
//
//    }
//
//    public void setZ(int z) {
//        this.z = z;
//    }
//
//    public int getZ() {
//        return z;
//    }
//
//    void printf(){
//        System.out.println(32131);
//    }
//
//    public static void main(String[] args) {
//       // Point3D point=new Point3D(1,2,3);
//       // point.printf();
//
//        Point2d point =new Point3D(1,2,3);
//        point.printf();
//        //point.getZ();       //如果父类变量引用子类的实例，那么这个变量只能使用父类在子类中所含有的实例，不能使用子类有而父类没有的。
//                              //上位类类型的变量可以引用下位类的实例，但下位类类型的变量不可以引用上位类的实例
//    }
//}

import java.awt.*;

public class Mainclass  {
    public static void main(String[] args) {
        Point point =new Point();
        int a= Integer.MAX_VALUE;
        System.out.println(a);
    }

    int a;
}

