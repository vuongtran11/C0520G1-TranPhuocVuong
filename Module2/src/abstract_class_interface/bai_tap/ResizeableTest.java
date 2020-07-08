package abstract_class_interface.bai_tap;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle1=new Circle(10);
        System.out.println(circle1.getArea());
        Resizeable circleResize=(Resizeable) circle1;
        circleResize.resize(10);

        Rectangle rec1=new Rectangle(10,20);
        System.out.println(rec1.getArea());
        Resizeable recResize=(Resizeable) rec1;
        recResize.resize(10);

    }
}
