///*
//public class tech1 {
//    public static void main(String[] args) {
//
//
//        */
///*final int a =10;
//        final int b =10;
//        System.out.println(b);
//
//        enum grade{a,b,c};
//
//        grade g=grade.a;
//        System.out.println(g);*//*
//
//
//
//      */
///*  String all=String.join("/","adsad","b","c");//在后面每个字符之间加个/
//        System.out.println(all);*//*
//
//
//      */
///*  String a=("123456");
//        a=a.substring(3,5)+"abcdefgh";//取第三位之后的到第五位的和后面的字符串组合在一起
//        System.out.println(a);
//        a=("123456");
//        a=a.substring(0,5)+"abcdefgh";
//        System.out.println(a);*//*
//
//
//        //字符串比较函数
//    */
///*    String a =("abc");
//        String b =("abcc");
//        String c =("abc");
//        String d =("Abc");
//        System.out.println(a.equals(b));//比较是否完全相同
//        System.out.println(a.equals(c));
//        System.out.println(a.equalsIgnoreCase(d));//比较字符串，但是忽略大小写
//*//*
//
//
//
//
//      */
///*  String a="abcdef";
//        System.out.println(a);
//        int cpCount=a.codePointCount(0, a.length());
//        System.out.println(cpCount);
//
//        char count1=a.charAt(0);//获得a这个字符串第0个字符
//        System.out.println(count1);
//
//        int index =a.offsetByCodePoints(0,4);//获得字符串从0到4的码点长度。
//        //看起来好像很傻逼，0到4不就是四个吗，但是实际上有个字符需要两个代码单元。所以会出现这个来获得码点长度。
//        System.out.println(index);*//*
//
//
//        int i=0;
//        String a="abcde";
//        int cp=a.codePointAt(i);
//        if(Character.isSupplementaryCodePoint(cp))i+=2;
//        else i++;
//    }
//}
//*/
//public class tech1{
//
//     String name;
//     int input;
//
//
//    tech1(String n,int b)
//    {
//        name=n;
//        input=b;
//    }
//
//    public String toString ()
//    {
//        return "名字是"+name;
//
//    }
//
//
//
//
//
//
//
//
//}
//
//     class tech2{
//
//
//
//}
//

/*public class tech1 {

    private String name;
    tech1(String name)
    {
        this.name=name;
    }
   public static void printf() {

        int b=3;
        System.out.println("你好");
    }

    private static int counter = 0;
    int input = 0;

    {
    input=counter++;        //实例初始化器，必须要打上这个括号，虽然看起来好像有点奇怪甚至说没那么合理但是就是要打上这个括号
    }                       //这个一个括号加上代码可以称作程序块
                            //实例初始化器会在构造函数的开头自动调用


    String getName()
    {
        return name;
    }
}*/

/*public class tech1{
    private  int a;
    private  String str;

    public tech1(int a, String str) {
        this.a = a;
        this.str = str;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}*/


<<<<<<< HEAD
/*
=======
>>>>>>> 8dd169f622fad6524f3e4c0e0b0ba381f2ebc867
public class tech1{
    public static void main(String[] args) {
        Object1 a =new Object1();
        Object1.Object2 obj2 =a.new Object2();
        System.out.println(obj2.a);
        Object1.Object2 obj21= new Object1().new Object2();
        Object1.Object2 obj22= a.new Object2();
    }
<<<<<<< HEAD
}*/
=======
}
>>>>>>> 8dd169f622fad6524f3e4c0e0b0ba381f2ebc867
