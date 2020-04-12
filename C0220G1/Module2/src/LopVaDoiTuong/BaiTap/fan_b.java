package LopVaDoiTuong.BaiTap;

public class fan_b {
    public static void main(String[] args) {
        fan_a fan1 = new fan_a();
        fan1.setSpeed("fast");
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        fan_a fan2 = new fan_a();
        fan2.setSpeed("medium");

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
