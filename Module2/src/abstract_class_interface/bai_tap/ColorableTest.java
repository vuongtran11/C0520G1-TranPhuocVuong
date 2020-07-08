package abstract_class_interface.bai_tap;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] ListShape=new Shape[4];
        ListShape[0]=new Square(12);
        ListShape[1]=new Rectangle(12,56);
        ListShape[2]=new Square(12);
        ListShape[3]=new Rectangle(56,23);
        for(Shape shape:ListShape){
            if(shape instanceof Square){
                ((Square) shape).howToColor();
            } else if (shape instanceof Rectangle){
                ((Rectangle) shape).howToColor();
            }
        }
    }
}
