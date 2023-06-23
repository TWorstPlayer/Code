import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;

public class text {
    static ArrayList<String> arrstu = new ArrayList<>();
    static ArrayList<String> arrtea = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        FileInputStream studentinput = new FileInputStream("D:\\桌面\\Code\\Java\\Java core tech\\text3\\src\\student.txt");
        BufferedReader buff1 = new BufferedReader(new InputStreamReader(studentinput));
        String str1;
        while ((str1 = buff1.readLine()) != null) arrstu.add(str1);
        studentinput.close();

        FileInputStream teacherinput = new FileInputStream("D:\\桌面\\Code\\Java\\Java core tech\\text3\\src\\teacher.txt");
        BufferedReader buff2 = new BufferedReader(new InputStreamReader(teacherinput));
        String str2;
        while ((str2 = buff2.readLine()) != null) arrtea.add(str2);
        teacherinput.close();
        //text.B();
        //text.C();
        //text.D();
        int $q=1;


    }

    static public void B() {
        for (int i = 0; i < arrstu.size() - 1; i++) {
            for (int j = i + 1; j < arrstu.size(); j++) {
                if (arrstu.get(i).equals(arrstu.get(j))) {
                    System.out.println(arrstu.get(i));
                }
            }
        }
    }

    static public void C() {
        for (int i = 0; i < arrstu.size(); i++) {
            String[] arr1 = arrstu.get(i).split(" ");
            for (int j = 0; j < arrtea.size(); j++) {
                String[] arr2 = arrtea.get(j).split(" ");
                //System.out.println(arr2[0]);
                if (arr1[0].equals(arr2[0])) System.out.println(arr2[0]);
            }
        }
    }

    static public void D() {
        String most="0";
        for (int i = 0; i <5; i++) {
            String[] arr1 = arrtea.get(i).split(" ");
            int a= Integer.parseInt(arr1[1]);
            int b= Integer.parseInt(most);
            if (a>b) {
                most=arr1[1];
            }
        }
        System.out.println(most);

    }
}



