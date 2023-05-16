public class trapezoid extends shape {
    private double topline;
    private double baseline;
    private double height;

    public trapezoid(double topline, double baseline, double height) {
        this.topline = topline;
        this.baseline = baseline;
        this.height = height;
    }


    @Override
    public double getArea() {
        return (topline+baseline)*height/2;
    }
}
