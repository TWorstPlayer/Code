public enum Size {
    SMALL("13165",5),MEDIUM("m",6),LARGE("l",7);
    private String abb;
    private int d;
    private Size(String str,int d)
    {
        abb=str;
        this.d=d;
    }

    public String getStr()
    {
        return abb;
    }
    public int getd()
    {
        return d;
    }
}
