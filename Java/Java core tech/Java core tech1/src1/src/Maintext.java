import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class Maintext {

    public static void main(String[] args) throws IOException {
       /* text a=new text();
        a.setA("abc");
        a.setB(1);
        a.setC(3.14);
        a.display();*/

      /*  abstract1 abst=new abstract1() {
            @Override
            void display() {

            }

        };
        abst.display();

        abstract1 a=new abstract11();
    }*/
        /*StringTokenizer st = new StringTokenizer("this is a test");
        while (st.hasMoreTokens())  {
            System.out.println(st.nextToken() );
        }*/
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);*/

        /*int[] arr= new int[]{1,2,3};*/

        /*ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
       // System.out.println(arr.size());
       Iterator<Integer> arr1= arr.iterator();
       while(arr1.hasNext()){
           int a=arr1.next();
           System.out.println(a);
       }*/

     /*   int ifa =1;
        int $1 =3;
        int _1 =3;*/
        /*StringTokenizer st = new StringTokenizer("this is,a,test of tokens", ",");
        String s;
        int count = 0;
        while (st.hasMoreTokens()) {
            s = st.nextToken();
            ++count;
            System.out.println(s);
        }
        System.out.println(count);*/

       /* ArrayList<String> arr1 =new ArrayList<>();
        arr1.add("a");
        arr1.add("b");
        arr1.add("c");
        Iterator ite1 =arr1.iterator();
       // while(ite1.hasNext()) System.out.println(ite1.next());

        Vector<String> arr2=new Vector<>();
        arr2.add("1");
        arr2.add("2");
        arr2.add("3");
        Iterator ite2 =arr2.iterator();
       // while(ite2.hasNext()) System.out.println(ite2.next());
        for(String str:arr2) System.out.println(str);
        for(String str:arr1) System.out.println(str);*/
       /* int [ ] x=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);

        }*/
       // int $a=3;
        /*Vector<String> arr2=new Vector<>();
        arr2.add("a");
        arr2.add("b");
        arr2.add("c");
        System.out.println(arr2.get(1));*/

       /* FileOutputStream file1=new FileOutputStream("D:\\桌面\\Code\\Java\\Java core tech\\Java core tech1\\src1\\src\\java.txt");

        byte[] arr={96,97,98,99,100,101};
        file1.write(arr,1,3);
        file1.close();

        FileInputStream file2= new FileInputStream("D:\\桌面\\Code\\Java\\Java core tech\\Java core tech1\\src1\\src\\java.txt");
        int a=file2.read();
        System.out.println((char)a);*/

        /*FileReader file3= new FileReader("D:\\桌面\\Code\\Java\\Java core tech\\Java core tech1\\src1\\src\\java.txt");
        int a=0;
        *//*while((a=file3.read())!=-1)
        System.out.print((char)a);*//*
        char [] arr=new char[1];
        while((a=file3.read(arr))!=-1) System.out.print(new String(arr,0,a));*/

        /*FileWriter file4 =new FileWriter("D:\\桌面\\Code\\Java\\Java core tech\\Java core tech1\\src1\\src\\java.txt");
        file4.write("This is a java test");
        file4.write("Tabbbbb");
        file4.close();
        //下面这个是续写
        FileWriter file5 =new FileWriter("D:\\桌面\\Code\\Java\\Java core tech\\Java core tech1\\src1\\src\\java.txt",true);
        file5.append("Tasdadasdasdas");
        file5.append("Tabbbbb");
        file5.close();

        FileReader file3= new FileReader("D:\\桌面\\Code\\Java\\Java core tech\\Java core tech1\\src1\\src\\java.txt");
        int a=0;
        while((a=file3.read())!=-1) System.out.print((char)a);*/

        /*BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
        String str=buf.readLine();
        System.out.println(str);*/
        /*PrintWriter stdErr = new PrintWriter (System.err, true);
        stdErr.println("Adasdasdasd");
        System.out.println("Adasdasdasd");*/
        /*System.err.println(12121);*/

    }
}

