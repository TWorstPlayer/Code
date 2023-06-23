import java.io.PrintWriter;

public class TestCardAccount {
    private static PrintWriter stdOut = new PrintWriter(System.out,true);
    private static PrintWriter stdErr = new PrintWriter (System.err,true);
    public static void assertTrue (String message,boolean condition) {
        if (! condition) {
            stdErr. print ("** Test failure ");
            stdErr. println (message);
        } }
    public static void main(String[] args) {
        boolean result;
        // Testing constructor and accessor
        CardAccount accountOne = new CardAccount();
       // accountOne.deposit();

    }
}
