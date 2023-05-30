public class Decorator implements ITREE{
    private ITREE Tree;
    public Decorator(ITREE Tree) {
        this.Tree=Tree;
    }

    @Override
    public String getDesc() {
        return Tree.getDesc();
    }
}
