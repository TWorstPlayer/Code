public class SLList {
    private IntNode first;
    public SLList(int x){
        first = new IntNode(x);
    }
    public void addlist(int x){
        IntNode p=first;

        while(p.next!=null)p=p.next;
        p.next=new IntNode(x);

    }

    /*静态方法中间类*/
    private static int size(IntNode p){
        if(p.next!=null)return 1+size(p.next);
        return 1;

    }
    public int size(){
        return size(first);

    }
    public static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i) {
            item = i;
            next = null;
        }
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }


    }
    public static void main(String[] args) {
        SLList a= new SLList(3);
        a.addlist(4);
        a.addlist(5);
        a.addlist(6);
        System.out.println(a.size());

    }


}
