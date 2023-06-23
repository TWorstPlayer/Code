
public abstract class FolderItem {
	private String name;
	public void setName(String aName) {
		name = aName;
	}

	public abstract void printf(int level);
}
