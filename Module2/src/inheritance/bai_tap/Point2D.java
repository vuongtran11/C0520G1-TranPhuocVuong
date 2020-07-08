package inheritance.bai_tap;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        double[] array = {this.x, this.y};
        return array;
    }

    public String toString() {
        return "Toa do X: " + this.getXY()[0] + "; Toa do Y: " + this.getXY()[1];
    }

    public static void main(String[] args) {
        Point2D haid = new Point2D(5, 6);
        haid.setXY(8, 9);
        System.out.println(haid.toString());
    }
}
