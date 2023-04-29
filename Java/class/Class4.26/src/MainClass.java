import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MainClass {
/*	public static void main(String[] args) {
		new MyGameFrame();
	}*/


	public static void main2(String[] args) {
		String []arr=new String[10];
		ArrayList<String> list =new ArrayList<>();
		list.add("aaa");
		list.ensureCapacity(list.size()+100000);
		list.trimToSize();
		list.add(2,"acbd");
		list.remove(0);

		Iterator <String>itr;			//迭代器
		itr =list.iterator();
		while(itr.hasNext())
		{
			String str =itr.next();

		}


	}
public static void main1(String[] args) {
	String[]  arr=null;
	String str ="aaa-bbb-ccc";

	arr =str.split("-");
	for(int i=0;i<arr.length;i++)System.out.println(arr[i]);

	for(String str1:str.split("-"))System.out.println(str1);

	String stra ="www.scu.edu.cn";
	for(String str1:stra.split("\\.",3))System.out.println(str1);//split 的用法

	String strb ="a>b or b>c";
	System.out.println();
	for(String str1:strb.split(">| or"))
		System.out.println(str1);

	String name;
	int quantity;
	double price;
	String strc="apple 100 12.5";
	String []arr1=strc.split(" ");
	name =arr1[0];
	quantity=Integer.parseInt(arr[1]);
	price = Double.parseDouble(arr[2]);


}

	public static void main3(String[] args) {
		Object o;
		Employee e1=null;
		Manager e2 =null;
		System.out.println(e1);


		e1 = new Employee("aaa", 10000, 2023, 4, 14);
	}


}
