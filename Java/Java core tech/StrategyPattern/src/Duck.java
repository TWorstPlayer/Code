public class Duck {

    FLYorNofly strategy;

    public void display(){
        System.out.println("这是一只鸭子");
    }
    public void swim(){
        System.out.println("会游泳");
    }
    public void fly(){
        if(strategy!=null)strategy.printf();
    }
    public  void setStrategy(FLYorNofly strategy){
        this.strategy=strategy;
    }
}
