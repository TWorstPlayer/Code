import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MainClass {
	public static void main(String[] args) {
		
		//new MyGameFrame();
		Folder fo1 = new Folder("fo1");
		Folder fo2_1 = new Folder("fo2_1");
		Folder fo2_2 = new Folder("fo2_2");
		Folder fo2_3 = new Folder("fo2_3");
		File fi2_1 = new File("fi2_1");
		File fi2_2 = new File("fi2_2");
		Folder fo3_1 = new Folder("fo3_1");
		Folder fo3_2 = new Folder("fo3_2");		
		File fi3_1 = new File("fi3_1");
		File fi3_2 = new File("fi3_2");
		fo1.addFolderItem(fo2_1);
		fo1.addFolderItem(fo2_2);
		fo1.addFolderItem(fo2_3);
		fo1.addFolderItem(fi2_1);
		fo1.addFolderItem(fi2_2);
		fo2_2.addFolderItem(fo3_1);
		fo2_2.addFolderItem(fo3_2);
		fo2_2.addFolderItem(fi3_1);
		fo2_2.addFolderItem(fi3_2);


	}
}
