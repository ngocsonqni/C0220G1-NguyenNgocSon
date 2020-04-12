package KeThua.BaiTap.MoveablePoint;

public class MoveablePoint extends Point{
    public float xSpeed=0.0f;
    public  float ySpeed=0.0f;
    public MoveablePoint(){}
    public MoveablePoint(float x,float y,float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=ySpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{getX(),getY()};
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+"),speed=("+getXSpeed()+","+getYSpeed()+")";
    }
    public MoveablePoint move(){
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
        return this;
    }
}
