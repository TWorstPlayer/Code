public class Fish extends Animal implements Pet{

    private String name;
    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("鱼没有腿，不能走路");
    }

    public Fish(int legs) {
        System.out.println("这是Fish.Fish(int legs)");
    }

    @Override
    public void eat() {
        System.out.println("这是Fish.eat");
    }

    @Override
    public String getname() {
        System.out.println("这个是Fish.getname方法");
        return null;
    }

    @Override
    public void setname(String name) {
        System.out.println("这是Fish.setname");
    }

    @Override
    public void play() {
        System.out.println("这是Fish.play");
    }

}