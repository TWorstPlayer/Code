public abstract class Animal {
    private int legs;

    public Animal() {
    }

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void walk();

    public abstract void eat();
    public void walk(int legs){
        System.out.println("该动物是用"+legs+"腿走路的");
    }

    public abstract String getname();

    public abstract void setname(String name);
}