public class son extends father{

    @Override
    public void display()throws RuntimeException/*,IOException */{
        System.out.println(1);
        throw new BIGException();
    }

    public son() {


    }
}
