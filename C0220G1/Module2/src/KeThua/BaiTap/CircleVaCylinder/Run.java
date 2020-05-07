package KeThua.BaiTap.CircleVaCylinder;

public class Run {
    public static void main(String[] args) {
        Circle circle=new Circle(3.5,"Blue");
        System.out.println(circle.toString());
        Cylinder cylinder=new Cylinder(10,3.5,"Green");
        System.out.println(cylinder.toString());
    }
}
