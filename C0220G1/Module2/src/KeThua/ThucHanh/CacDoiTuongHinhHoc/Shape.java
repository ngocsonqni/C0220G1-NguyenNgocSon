package KeThua.ThucHanh.CacDoiTuongHinhHoc;

public class Shape {
    private String color="Green";
    private boolean filled=true;
    public Shape(){}
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String Color){
        this.color=color;
    }
    public Boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of "
                + getColor()
                + " and "
                + (getFilled() ? "filled" : "not filled");
    }
}
