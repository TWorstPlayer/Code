public class Inlist {

    public int first;
    public Inlist rest;

    public Inlist(int first,Inlist rest){
        this.first=first;
        this.rest=rest;

    }


 /*   public int size(){
        int count=1;
        Inlist L=this;
        while(true){
            if(L.rest!=null) {
            L = L.rest;
            count++;
        }
            else break;

        }
        return count;
    }*/
 static Integer count=0;
    /*public Integer size(){

        count++;
        if(this.rest!=null){
            this.rest.size();
        }

        return count;

    }*/
    public Integer size(){

        if(this.rest!=null)return 1+this.rest.size();
        return 1;


    }
    public static void main(String[] args) {
        Inlist L=new Inlist(3,null);
        L=new Inlist(4,L);
        L=new Inlist(5,L);
        L=new Inlist(6,L);
        L=new Inlist(7,L);
        System.out.println(L.size());
        /*System.out.println(L.first);
        System.out.println(L.rest.first);
        System.out.println(L.rest.rest.first);*/
    }
}