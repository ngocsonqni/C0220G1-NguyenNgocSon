package KeThua.BaiTap.Triangle;

public class TriangleRun {
    public static void main(String[] args) {
        Triangle triangle1=new Triangle();
        Triangle triangle2=new Triangle(3.3,4.4,5.5);
        Triangle triangle3=new Triangle("Gray",false,6.6,7.7,8.8);
        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());
        System.out.println(triangle3.toString());
    }
}
