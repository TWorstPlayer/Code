public enum Direction {
    UP("UP",0),RIGHT("RIGHT",1),DOWN("DOWN",2),LEFT("LEFT",3);

    private String direction;
    private int i;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    Direction(String direction, int i) {
        this.direction=direction;
        this.i=i;
    }
}
