public class ClassA {

    private int x;
    private int y;
    private Icla cal;
    public void setX(int a){x=a;}
    public void setY(int a){y=a;}
    public void setCal(Icla a){cal=a;}

  /*  public ClassA() {

    }*/
    public void calculate(){
        System.out.println(cal.calculate2(x,y));
    }
    public void repaint() {
        System.out.println("ClassA->repaint");
        paint();

    }
    public void paint () {
        System.out.println("ClassA->paint");
    }
}


