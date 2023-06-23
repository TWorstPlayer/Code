import java. util. Iterator;
import java.util.Objects;
import java. util. Vector;
public class MainClass {
    Vector vector = new Vector ();
    public static void main (String[] args) {
        MainClass mainClass = new MainClass();
        System. out. println ("print all strings:");
        mainClass.printElements();
        System. out. println ("print strings with prefix 'country':");
        mainClass.printStartsWith ("country");
        System.out.println ("print strings after deleting:");
        mainClass.deleteStartsWith ("country");
        mainClass.printElements();
    }
    public MainClass() {
        vector.add ("country China");
        vector.add ("country America");
        vector.add ("country English");
        vector.add ("name Mary");
        vector.add ("name Linda");
        vector.add ("name Mike");
        vector.add ("name John");
    }
    public void printElements( ) {
        for(Object str:vector) System.out.println(str);
}
    public void deleteStartsWith (String prefix) {
        for (int i = vector.size()-1; i>=0; i--) {
            String str= (String)vector.get(i);
            String[] arr=str.split(" ");
            if(arr[0].equals(prefix)) {
                vector.remove(i);
            }

}
    }
    public void printStartsWith (String prefix) {
        for (int i = vector.size()-1; i>=0; i--) {
            String str= (String)vector.get(i);
            String[] arr=str.split(" ");
            if(arr[0].equals(prefix)) {
                System.out.println(str);
            }
        }
    } }