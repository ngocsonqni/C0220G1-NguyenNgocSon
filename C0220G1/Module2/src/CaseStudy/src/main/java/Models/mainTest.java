package Models;

public class mainTest {
    public static void main(String[] args) {
        Services villa=new Villa("villa",20,100,50,"2 ngay",
                "vip","khong co",50,2);
        Services house=new House("House",20,100,50,"2 ngay",
                "vip","khong co",2);
        Services room=new Room("Room",20,100,50,"2 ngay",
                "khong co");
        villa.showInfor();
        System.out.println("----------------------------");
        house.showInfor();
        System.out.println("----------------------------");
        room.showInfor();
    }
}
