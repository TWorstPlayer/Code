/*
import javax.lang.model.element.NestingKind;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Random;

*/
/*
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
//
//import java.awt.*;
//
//public class Mainclass  {
//    public static void main(String[] args) {
//        Point point =new Point();
//        int a= Integer.MAX_VALUE;
//        System.out.println(a);
//    }
//
//    int a;
//}

*//*
*/
/*

*//*

*/
/*
import java.util.Vector;

public class Object1 {

//    protected String d(){
//        return "Hi";
//
//    }

    public static void main(String[] args) {
//        Object2 object2=new Object2();
//        Object1 object1=new Object1();
//        System.out.println(object2.d());
//        System.out.println(object1.d());
//        int [] arr=new int[3];
        Vector v=new Vector();
        v.addElement(1);
        v.addElement("abc");
        v.addElement(3.141459);
        v.insertElementAt(4,0);
        System.out.println(v.firstElement());       //查询第一个元素
        System.out.println(v.lastElement());        //查询最后一个
        System.out.println(v.elementAt(1)); //查询指定元素
        System.out.println(v.size());               //返回元素个数
        System.out.println(v.capacity());           //返回容量

    }
}
*//*
*/
/*
*//*

*/
/*



//class Object2 extends Object1 {
//
//    protected String d(){
//
//        return super.d();
//    }
//}

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Object1{

    public static void main(String[] args) throws IOException {
        *//*
*/
/*

*//*

*/
/*Scanner input1 =new Scanner(Path.of("D:\\桌面\\code\\Java\\Java core tech\\Java core tech1\\abc.txt"), StandardCharsets.UTF_8);
        Scanner input2 =new Scanner(System.in);

        int a =input1.nextInt();
        String str = input1.next();

        System.out.println(a);
        System.out.println(str);*//*
*/
/*
*//*

*/
/*


      *//*
*/
/*

*//*

*/
/*  String a= "acbnd";
        System.out.printf("%8s",a);
*//*
*/
/*
*//*

*/
/*

        //System.out.printf("%tc",new Date());



        //for each 的用法
        //直接遍历整个数组，对比于另外一种用for遍历数组的写法来说，这一种写法可以不用管边界元素，防止越界

       *//*
*/
/*

*//*

*/
/* int []arr = new int[4];
        arr[0]=1;
        arr[1]=11;
        arr[2]=111;
        arr[3]=11111;

        for(int a:arr)
        {
            System.out.println(a);
        }*//*
*/
/*
*//*

*/
/*




    *//*
*/
/*

*//*

*/
/*    int []arr = new int[4];
        arr[0]=81;
        arr[1]=1;
        arr[2]=111;
        arr[3]=1311;
        Arrays.sort(arr);

        for(int a:arr)
        {
            System.out.println(a);
        }*//*
*/
/*
*//*

*/
/*



        var a=1;
        System.out.println(a);



    }
}

*//*
*/
/*



import java.io.IOException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Object1 {
    private static int []arr2=new int[8];

    public static void main(String[] args) throws IOException {
   *//*

*/
/*     //字符串的四种构造方法
        //1：使用直接赋值的方式得到字符串
        String str1= "abc";
        System.out.println(str1);

        //2:使用new的方式来获取一个新的字符串
        //空参构造，获得空白的一个字符串，不含任何内容
        String str2 =new String();
        System.out.println(str2);

        //传递一个字符串，根据传递的字符串内容再构造一个新的字符串对象
        String str3 =new String("abc");
        System.out.println(str3);

        //3:传递字符数组，自动把字符数组拼接成字符串
        char []arr ={'a','b','c'};
        String str4=new String(arr);
        System.out.println(str4);

        //4：传递一个字节数组（byte数组），根据字节数组的内容再创建一个新的字符串，字节数组里的内容对照ASSIC表翻译
        byte []arr2={97,98,99};
        String str5=new String(arr2);
        System.out.println(str5);
        //用int数组不行*//*
*/
/*




        *//*

*/
/*String s1 ="abc";
        String s2 ="ab";
        String s3=s2+"c";
        System.out.println(s1==s3);//结果是false
        //JDK8以前，字符串拼接是底层产生一个StringBuilder对象，然后使用其append方法进行拼接
        //然后再用toString方法转换回String类型，而toString方法的底层是new了一个字符串，数据存储在堆区里面
        //在JDK8以后，系统预估字符串大小，然后把字符串存在数组里面，此时也是产生一个新的字符串
        //而s1这种直接赋值法是在串区存储，与s3的地址是不同的，所以结果是false*//*
*/
/*


        *//*

*/
/*String s1 ="abc";
        String s2="a"+"b"+"c";
        System.out.println(s1==s2);//结果是true
        System.out.println(s1.hashCode());//打印s1的地址，结果为96354
        System.out.println(s2.hashCode());//打印s2的地址，结果也为96354，说明了s2和s1指向同一个字符串
        //这种情况下没有变量，在编译过程中存在常量优化机制，直接把a，b，c接在一起成为abc然后就找到串池里面的abc*//*
*/
/*


     *//*

*/
/*   StringBuilder sb =new StringBuilder("ac");
        System.out.println(sb.capacity());
        sb.append("aaaaaaaaaaaaaaaaa");
        System.out.println(sb.capacity());*//*
*/
/*



        *//*

*/
/*ArrayList<String> arr =new ArrayList<>();
        arr.add("Abc");
        arr.add(" Asdasad");
        arr.add(" Asdasad");
        System.out.println(arr);

        String a=arr.remove(0);
        System.out.println(arr);
        boolean b=arr.remove(" Asdasad");
        System.out.println(arr);
        System.out.println(a);
        System.out.println(b);


        String c=arr.set(0,"cbd");
        System.out.println(arr);
        System.out.println(c);


        ArrayList<Integer> arr1 =new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        System.out.println(arr1.get(0));
*//*
*/
/*

        *//*

*/
/*int []arr =new int[8];
        for (int i = 0; i <8 ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
            System.out.print(arr2[i]);
            System.out.print(" ");
        }*//*
*/
/*


      *//*

*/
/*  Runtime.getRuntime().exec("shutdown -s -t 3600");//设定3600秒后自动关机
        Runtime.getRuntime().exec("shutdown -a");//取消自动关机*//*
*/
/*


  *//*

*/
/*      String str ="abc";
        if(str.charAt(0)=='a')
        {
            System.out.println(1);
        }

*//*
*/
/*


      *//*

*/
/*  //正则表达式
        //1：字符类正则表达式（只匹配一个字符）
        System.out.println("字符类正则表达式");
        System.out.println("a".matches("[a-d]"));          //a-d                 结果：true
        System.out.println("b".matches("[a-b[c-d]]"));     //a-b和c-d的并集       结果：true
        System.out.println("c".matches("[a-b&&[^d-e]]"));  //a-b和非d-e的交集     结果：false
        System.out.println("c".matches("[^c]"));           //非c                 结果：false
        System.out.println("预定义字符");
        //2：预定义字符（只匹配一个字符）
        System.out.println("1".matches("."));
        System.out.println("a".matches("."));

        System.out.println("1".matches("\\d"));
        System.out.println("a".matches("\\d"));*//*
*/
/*


      *//*

*/
/*  Object[] arr1 =new Object[3];
        Object[] arr2 =new Object[3];

        arr1[0]="abc";
        arr2[0]="abc";

        arr1[1]=1.1;
        arr2[1]=2.1;

        arr1[2]='a';
        arr2[2]='b';

      *//*
*/
/*
*//*

*/
/*  if(arr1[0]==arr2[0]) System.out.println(1);
        if(arr1[1]!=arr2[1]) System.out.println(-1);
        if(arr1[2]!=arr2[2]) System.out.println(-1);*//*
*/
/*
*//*

*/
/*
        arr1[1]=(double)arr1[1]+(double)arr2[1];
        System.out.println(arr1[1]);*//*
*/
/*


       *//*

*/
/* String [][] arr2= {{"1"}};
        System.out.println(2+arr2[0][0]);*//*
*/
/*


       *//*

*/
/* Object []arr =new Object[3];
        arr[0]=1;
        arr[1]=1.5;
        arr[2]='a';
        arr[3]="abc";

        int a=1;
        a=a+(int)arr[0];*//*
*/
/*


        //字符串数组的排序
        //方法 Arrays.sort(arr);
    *//*

*/
/*    String []arr ={"goodA","goodC","goodB","goodD","goodA","goodB"};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(arr[i]+" ");
        }*//*
*/
/*


    }
}*//*

public class Object1 implements Cloneable{


    public static void main(String[] args) {
     */
/*   String a= "abbc";
        String b= "abbc";
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());*//*

   */
/*     String a=null;
        String b="abc";
        System.out.println(b.equals(a));
        System.out.println(a==b);
*//*


        */
/*BigInteger a = new BigInteger("99999999999999999999999999999999999999999999999999999999999999999999999");
        System.out.println(a);*//*


       */
/* for (int i = 0; i < 100; i++) {
            System.out.println(new BigInteger(4,new Random()));
        }*//*

*/
/*        BigInteger a = new BigInteger("3");
        BigInteger ab = new BigInteger("4");
        BigInteger abc = new BigInteger("3");
        System.out.println(a);
        System.out.println(ab);
        System.out.println(a==abc);
        System.out.println(a.hashCode());
        System.out.println(abc.hashCode());*//*


       */
/* BigInteger a =new BigInteger("100",2); //
        System.out.println(a);                              //结果为4，意思是把二进制的100转换为十进制

        BigInteger a1= new BigInteger("1000");
        int b1 =10000;
        System.out.println(b1-a1.intValue());

        BigInteger a2=BigInteger.valueOf(1000);

        System.out.println(Long.MAX_VALUE);*//*


      */
/*  //用字符串赋值的方法得到的数据是精确的
        BigDecimal bdl1= new BigDecimal("0.01");
        BigDecimal bdl2= new BigDecimal("0.02");
        System.out.println(bdl1);       //0.01
        System.out.println(bdl2);       //0.02
        //直接用数字得到的数据是不准的
        BigDecimal bdl3= new BigDecimal(0.01);
        BigDecimal bdl4= new BigDecimal(0.02);
        System.out.println(bdl3);       //0.01000000000000000020816681711721685132943093776702880859375
        System.out.println(bdl4);       //0.0200000000000000004163336342344337026588618755340576171875
        //用静态方法获取
        BigDecimal bdl5=BigDecimal.valueOf(10.0);
        BigDecimal bdl6=BigDecimal.valueOf(10.0);
        System.out.println(bdl5==bdl6); //结果为false  这个是new了两个新的对象

        BigDecimal bdl7=BigDecimal.valueOf(10);
        BigDecimal bdl8=BigDecimal.valueOf(10);
        System.out.println(bdl7==bdl8); //结果为true  传递的是0-10之间的整数的话，会返回已经创建好了的对象，不会再重新new一个。*//*



    }



}
*/


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Object1 {
  /*  public static void main(String[] args) {
        Integer []arr= {3,2,1,4,6,8};
       // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }*/


    public static void main(String[] args) {
        char []arr={'a','b','c'};
        int  []arr1={2,3,2,1,4,5};
        for (int i:arr1
             ) {
            System.out.println(arr1[i]);

        }
    }

}
