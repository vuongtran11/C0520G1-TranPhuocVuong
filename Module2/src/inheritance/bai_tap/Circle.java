package inheritance.bai_tap;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Radius: "+this.radius+"Color: "+this.color;
    }
}


