package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra:");
        String str=scanner.nextLine();
        System.out.println("nhap vao ki tu can kiem tra:");
        String a=scanner.next();
        for (int i=0;i<str.length();i++){
            if (Character.toString(str.charAt(i)).equals(a)){
                count++;
            }
        }
        System.out.println("so lan xuat hien cua "+a+" trong chuoi "+str+" la: "+count);
    }
}
