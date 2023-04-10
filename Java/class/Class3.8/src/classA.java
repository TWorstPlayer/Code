public class classA {






    private int add( int a ,int b)
    {
            return a+b;
    }
    //public 可见性，公用的，可以被全部调用。
    //private//私密的，只有classA本类里面可以调用。
    //protected//可以被同一个包里的调用。

    //static 可以直接通过类名访问，不用实例访问。  csdn一下，不能用new 去new出来
    //static public 的各种不同的区别和用法。

    //实例变量和静态变量的区别
    //构造函数是什么


     protected int minus( int a ,int b)
    {
        return a-b;
    }

    public int multiply( int a ,int b)
    {
        return a*b;
    }



}
