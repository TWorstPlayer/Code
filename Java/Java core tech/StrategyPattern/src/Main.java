import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BlackDuck bduck =new BlackDuck();
        bduck.fly();

        bduck.setStrategy(new fly());
        bduck.fly();

        bduck.setStrategy(new Nofly());
        bduck.fly();

    }
}
