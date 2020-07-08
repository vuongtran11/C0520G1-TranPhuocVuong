package inheritance.bai_tap;

public class Point3D extends Point2D {
    private double z;
    public Point3D(double x, double y,double z) {
        super(x, y);
        this.z=z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x,double y,double z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);

    }
    public double[] getXYZ(){
        double[] array={this.getX(),this.getY(),this.z};
        return array;
    }
    public String toString(){
        return "Toa do X: "+this.getXYZ()[0]+"; Toa do Y: "+ this.getXYZ()[1]+"; Toa do Z: "+ this.getXYZ()[2];
    }

    public static void main(String[] args) {
        Point3D bad=new Point3D(6,8,4);
        System.out.println(bad.toString());
        bad.setXYZ(12,354,23);
        System.out.println(bad.toString());
    }
}
