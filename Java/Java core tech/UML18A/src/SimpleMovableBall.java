class SimpleMovableBall extends MovableBall {
    protected double x, y, dx, dy;
    protected double radius;
    public SimpleMovableBall(double x, double y, double radius) {
// To do (1)
        this.x=x;
        this.y=y;
        this.radius=radius;
        dx = 20.0;
        dy = 20.0;
    }
    public double getX() {
        // TO do (2)
        return x;
    }
    public double getY() {
        // TO do (3)
        return y;
    }
    public double getRadius() {
        // TO do (4)
        return radius;
    }
    public double getXMotion() {
        return dx;
    }
    public double getYMotion() {
        return dy;
    }
    public void setMotion(double dx, double dy) {
        this.dx=dx;
        this.dy=dy;
// TO do (5)
    }public void move() {
        x += dx;
        y += dy;
    }
}