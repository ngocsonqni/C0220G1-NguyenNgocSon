package NhapMonJava.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        while (true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap thang: ");
            byte month=scanner.nextByte();
            System.out.println("Nhap nam: ");
            short year=scanner.nextShort();
            boolean leap;
            if (year % 4 == 0) {
                if (year%100==0){
                    if (year%400==0){
                        leap=true;
                    }
                    leap=false;
                }
                leap=true;
            }
            else {leap=false;
            }
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang "+month+" co 30 ngay");
                    break;
                case 2:
                    if (leap){
                        System.out.println("thang 2 co 29 ngay");
                    } else{
                        System.out.println("thang 2 co 28 ngay");
                    }
                    break;
                default:
                    System.out.println("thang "+month+ " co 31 ngay");
            }
        }
    }
}
