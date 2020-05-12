package Interface.BaiTap.Resizeable;

public class Run {
    public static void main(String[] args) {
        Circle circle= new Circle(3.5, "indigo", false);

        System.out.println(circle.toString());
        circle.resize(20);
        System.out.println(circle.toString());


        Rectangle rectangle=new Rectangle(10,10,"Green",false);

        System.out.println(rectangle.toString());
        rectangle.resize(30);
        System.out.println(rectangle.toString());
    }
}
