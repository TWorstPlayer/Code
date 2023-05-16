public class circle extends shape{

    private double redius;

    public circle(double redius) {
        this.redius = redius;
    }

    @Override
    public double getArea() {
        return redius*redius*Math.PI;
    }
}
