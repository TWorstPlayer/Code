import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws RuntimeException{
        int input=0;

       while(true)
        {
            try {
                Scanner input1 = new Scanner(System.in);
                input = input1.nextInt();

                Main1 a =new Main1();
                a.check(input);

            } catch (BIGException e) {
                e.printStackTrace();
            }
        }
    }

    public void check(int input)throws BIGException{
        if(input>5)throw new BIGException("输入的数字太大了");
    }
}