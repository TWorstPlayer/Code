import java.util.ArrayList;


public class Folder extends FolderItem{
	private ArrayList<FolderItem> folderItems = new ArrayList<>();

	public Folder(String str) {
		setName(str);
	}

	public void addFolderItem(FolderItem item) {
		folderItems.add(item);

	}

	public void removeFolderItem(FolderItem item) {
		folderItems.remove(item);
	}

	public FolderItem getFolderitem(int index) {
		return folderItems.get(index);
	}

	public int getNumberOfFolderItem() {
		return folderItems.size();

	}

	@Override
	public void printf(int level) {
		String str="";
		for (int i=0;i<level;i++) {
			str+="---";
		}
		System.out.println(str);

	}

}
