package NhapMonJava.BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("nhap chieu dai: ");
                int chieuDai=scanner.nextInt();
                System.out.println("nhap chieu rong: ");
                int chieuRong=scanner.nextInt();
                for (int i=0;i<chieuRong;i++){
                    for (int j=0;j<chieuDai;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("The corner is square at 4 different angles:");
                System.out.println("1. Top-left");
                System.out.println("2. Top-right");
                System.out.println("3. botton-left");
                System.out.println("4. botton-right");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                int choice2=scanner.nextInt();
                System.out.println("nhap canh vuong: ");
                int canhVuong=scanner.nextInt();
                    switch (choice2){
                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            for (int i=0;i<canhVuong;i++){
                                for (int j=0;j<(canhVuong-i);j++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int a=0;a<canhVuong;a++){
                                for (int i=0;i<a;i++){
                                    System.out.print("  ");
                                }
                                for (int j=0;j<(canhVuong-a);j++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i=0;i<canhVuong;i++){
                                for (int j=0;j<=i;j++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i=0;i<canhVuong;i++){
                                for (int j=0;j<(canhVuong-i);j++){
                                    System.out.print("  ");
                                }
                                for (int j=0;j<=i;j++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                    }
                break;
            case 3:
                System.out.println("nhap canh tam giac can: ");
                int canh=scanner.nextInt();
                for (int i=0;i<canh;i++){
                    for (int j=0;j<(canh-i);j++){
                        System.out.print(" ");
                    }
                    for (int j=0;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
