
public class File extends FolderItem {
	public File(String name) {
		setName(name);
	}
	private String extension;
	private int size;

	@Override
	public void printf(int level) {
		String str="";
		for (int i=0;i<level;i++) {
			str+="---";
		}
		System.out.println(str);
	}
}
