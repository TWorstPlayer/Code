import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input=new InputStreamReader(new FileInputStream("D:\\×ÀÃæ\\Code\\Java\\Java core tech\\text4\\src\\abc.txt"));
        /*char a=' ';
        int ch;
        while((ch=input.read())!=-1) System.out.println((char)ch);*/
      /*  char []arr=new char[2];
        int ch;
        while((ch=input.read(arr))!=-1) System.out.println(new String(arr));*/
        /*BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        String a=buff.readLine();
        System.out.println(a);
*/
        String[] arr= new String[3];
        arr[2]="a";
        System.out.println(new String(Arrays.toString(arr)));
        int[] arr1=new int[3];
        arr1[2]=1;
        for (int i=0;i<3;i++) System.out.println(arr1[i]);



    }
}