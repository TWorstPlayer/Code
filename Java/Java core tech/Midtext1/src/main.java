public class main {
    public static void main(String[] args) {
        circle c =new circle(2);
        System.out.println(c.getArea());

        rectangle r =new rectangle(3,4);
        System.out.println(r.getArea());

        trapezoid t=new trapezoid(2,3,4);
        System.out.println(t.getArea());

    }
}
