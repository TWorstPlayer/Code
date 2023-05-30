public class Gardland extends Decorator{
    public Gardland(ITREE Tree) {
        super(Tree);
    }
    public String getDesc() {
        return super.getDesc()+"+"+"Gardland";
    }
}
