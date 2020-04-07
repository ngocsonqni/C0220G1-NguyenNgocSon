package ThucHanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        while (true){
            Scanner scanner=new Scanner(System.in);
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
            if (leap){
                System.out.println(year+" la nam nhuan");
            } else{
                System.out.println(year+" khong phai nam nhuan");
            }
        }
    }
}
