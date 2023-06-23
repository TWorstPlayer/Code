public class text {
   static class A {
        public void foo (Object o) {System. out. println ("A");}
    }
    static class B {
        public void foo (String o) {System. out. println ("B"); }
    }
    static class C extends A {
        public void foo (String s) {System. out. println ("C");}
    }
    static class D extends B {
        public void foo (Object o) {System. out. println ("D");}
    }

    public static void main(String[] args) {
        A a = new C();
        a.foo("Java");
        C c = new C();
        c.foo("Java");
        B b = new D();
        b.foo("Java");
        D d = new D();
        d.foo("Java");
    }



}