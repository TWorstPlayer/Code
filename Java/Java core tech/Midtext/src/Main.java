import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1：
        ArrayList<Student> stuarr =new ArrayList<>();

        //2:
        Student stu1=new Student("Zhang San",20);
        Student stu2=new Student("Li Si",21);
        Student stu3=new Student("Wang Wu",23);

        //3:
        stuarr.add(stu1);
        stuarr.add(stu2);
        stuarr.add(stu3);

        //4:
        for(int i=0;i<stuarr.size();i++) System.out.println(stuarr.get(i).getName()+" "+stuarr.get(i).getAge());;

        
    }
}