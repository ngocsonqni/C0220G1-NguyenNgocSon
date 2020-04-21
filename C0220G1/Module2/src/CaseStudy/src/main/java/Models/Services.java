package Models;

public abstract class Services {
    private String nameServices;
    private double area;
    private int costServices;
    private int accompanying;
    private String typeRent;
    public Services(String nameServices,double area,int costServices,int accompanying,String typeRent){
        this.nameServices=nameServices;
        this.area=area;
        this.costServices=costServices;
        this.accompanying=accompanying;
        this.typeRent=typeRent;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCostServices() {
        return costServices;
    }

    public void setCostServices(int costServices) {
        this.costServices = costServices;
    }

    public int getAccompanying() {
        return accompanying;
    }

    public void setAccompanying(int accompanying) {
        this.accompanying = accompanying;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract void showInfor();

}
