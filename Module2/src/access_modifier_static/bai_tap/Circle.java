package access_modifier_static.bai_tap;

public class Circle {
    private double radius=1.0;
    private String color="red";
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*3.14;
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(5.0);
        System.out.println(circle1.getRadius()+"_"+circle1.getArea());
        Circle circle2=new Circle(9.0);
        System.out.println(circle2.getRadius()+"_"+circle2.getArea());
    }
}

