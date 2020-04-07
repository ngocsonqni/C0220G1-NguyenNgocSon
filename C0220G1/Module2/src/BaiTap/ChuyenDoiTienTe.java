package BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        while (true){
            final int rate=23000;
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap vao gia tri USD muon chuyen sang VND: ");
            int usd=scanner.nextInt();
            System.out.println(usd+"$ = "+usd*rate+" VND");
        }
    }
}
