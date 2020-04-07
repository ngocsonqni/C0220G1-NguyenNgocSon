package NhapMonJava.ThucHanh;

import java.util.Scanner;

public class DebugUngDungJava {
    public static void main(String[] args) {
        System.out.println("Nhap phuong trinh bac nhat (ax+b=0): ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a: ");
        double a=scanner.nextDouble();
        System.out.println("b: ");
        double b=scanner.nextDouble();
        if (a!=0){
            double equal=-b/a;
            System.out.println("nghiem cua phuong trinh "+a+"x + "+b+" = 0 la: "+equal);
        }else{
            if(b==0){
                System.out.println("phuong trinh co vo so nghiem");
            } else {
                System.out.println("phuong trinh khong co nghiem");
            }
        }
    }
}
