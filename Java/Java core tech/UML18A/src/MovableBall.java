public abstract class MovableBall {
    public abstract double getX();
    public abstract double getY();
    public abstract double getXMotion();
    public abstract double getYMotion();
    public abstract void setMotion(double dx, double dy);
    public abstract double getRadius();
    public abstract void move();
}