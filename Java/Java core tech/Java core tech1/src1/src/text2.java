public class text2 {
    static {
        System.out.println("测试静态初始化器");
    }
    {
        System.out.println("测试实例初始化器1");
    }
    {
        System.out.println("测试实例初始化器2");
    }
    static public void display(){
        System.out.println("abc");
    }
}
