public class Cylinder{
    private double height;
    private Circle base;

    Cylinder(double height, Circle base) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder[height=" + height + ",base=" + base + "]";
    }
}