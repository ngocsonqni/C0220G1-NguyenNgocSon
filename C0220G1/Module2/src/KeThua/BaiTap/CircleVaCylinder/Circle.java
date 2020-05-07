package KeThua.BaiTap.CircleVaCylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public  String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "Hinh tron co mau "+getColor()+" , co ban kinh: "+getRadius()+"  co dien tich:"+getRadius();
    }
}
