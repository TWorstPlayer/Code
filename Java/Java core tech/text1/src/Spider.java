public class Spider extends Animal{

    public Spider(int legs) {
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("这个是Spider.walk");
    }

    @Override
    public void eat() {
        System.out.println("这个是Spider.eat");
    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public void setname(String name) {

    }
}