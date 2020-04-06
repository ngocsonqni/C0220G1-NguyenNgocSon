package ThucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
        public static void main(String[] args) {
            while (true){
                Scanner scanner=new Scanner(System.in);
                System.out.println("nhap so can kiem tra so nguyen to: ");
                int num=scanner.nextInt();
                boolean check=false;
                if (num<=1){
                    check=true;
                }else{
                    for (int i=2;i<num;i++){
                        if(num%i==0){
                            check=true;
                            break;
                        }
                    }
                }
                if (check){
                    System.out.println(num+" khong phai so nguyen to");
                }else {
                    System.out.println(num+" la so nguyen to");
                }
            }
        }
    }

