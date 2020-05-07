package Models;

public class Room extends Services {
    private String freeService;

    public Room(String servicesCode,String nameServices,double area,int costServices,int accompanying,String typeRent,
                 String freeService){
        super(servicesCode,nameServices,area,costServices,accompanying,typeRent);
        this.freeService=freeService;
    }
    public String getFreeService() {
        return freeService;
    }
    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    @Override
    public void showInfor() {
        System.out.println("Ten dich vu: "+super.getNameServices());
        System.out.println("Dien tich su dung: "+super.getArea());
        System.out.println("Chi phi thue: "+super.getCostServices());
        System.out.println("So luong nguoi toi da: "+super.getAccompanying());
        System.out.println("Kieu thue: "+super.getTypeRent());
        System.out.println("Dich vu mien phi kem theo: "+this.getFreeService());
    }
}
