package KeThua.BaiTap.CircleVaCylinder;

public class Cylinder extends Circle {
    private double hight;
    public Cylinder(double hight,double radius, String color) {
        super(radius, color);
        this.hight=hight;
    }
    public double getHight(){
        return this.hight;
    }
    public void setHight(){
        this.hight=hight;
    }
    public double getTheTich(){
        return super.getArea()*hight;
    }
    @Override
    public String toString(){
        return "Hinh tru co mau "+super.getColor()+" , co ban kinh: "+super.getRadius()+" va chieu cao: "+getHight()+"   co the tich la "+getTheTich();
    }
}
