package inheritance.bai_tap;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius,String color, double height){
        super(radius,color);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "Radius: "+this.getRadius()+"; Color: "+this.getColor()+"; Height:"+this.getHeight();
    }
    public double getArea(){
        return this.getRadius()*this.getRadius()*this.getHeight()*3.14;
    }
    public void Screen(){
        System.out.println("In Cylinder :"+ toString());
        System.out.println("In dien tich :"+ getArea());
    }
    public static void main(String[] args) {
        Circle cylinder = new Cylinder(5,"red",7);
        Cylinder cylinder1= (Cylinder) cylinder;
        cylinder1.Screen();
    }
}



