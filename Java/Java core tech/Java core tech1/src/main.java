import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Vector vector=new Vector(4);
        vector.add(new tech1(1,"abc"));
       tech1 tch=(tech1)vector.elementAt(0);
        System.out.println(tch.getA());


    }
}
