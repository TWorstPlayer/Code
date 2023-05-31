public class Test {
    public static void main(String[] args) {
        ITREE tree1=new ArtificialTree();
        tree1=new Bubblelelight(tree1);
        System.out.println(tree1.getDesc());

        ITREE tree2=new FlockedTree();
        tree2=new Bubblelelight(tree2);
        tree2=new Gardland(tree2);
        tree2=new Gardland(tree2);
        System.out.println(tree2.getDesc());





    }
}
