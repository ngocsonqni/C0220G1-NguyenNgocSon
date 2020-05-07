package Models;

public class Villa extends Services {
    private String roomStandard;
    private String otherAmenities;
    private double areaPool;
    private int numFloor;
    public Villa(String servicesCode,String nameServices,double area,int costServices,int accompanying,String typeRent,
                String roomStandard,String otherAmenities,double areaPool,int numFloor){
        super(servicesCode,nameServices,area,costServices,accompanying,typeRent);
        this.roomStandard=roomStandard;
        this.otherAmenities=otherAmenities;
        this.areaPool=areaPool;
        this.numFloor=numFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    @Override
    public void showInfor() {
        System.out.println("Ten dich vu: "+super.getNameServices());
        System.out.println("Dien tich su dung: "+super.getArea());
        System.out.println("Chi phi thue: "+super.getCostServices());
        System.out.println("So luong nguoi toi da: "+super.getAccompanying());
        System.out.println("Kieu thue: "+super.getTypeRent());
        System.out.println("Tieu chuan phong: "+this.getRoomStandard());
        System.out.println("Tien nghi khac: "+this.getOtherAmenities());
        System.out.println("Dien tich ho boi: "+this.getAreaPool()+" m2");
        System.out.println("So Tang: "+this.getNumFloor());
    }
}
