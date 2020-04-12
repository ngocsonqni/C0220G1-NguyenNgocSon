package LopVaDoiTuong.BaiTap;

import java.util.Scanner;

public class PhuongTrinhBacHai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.println("CALCULATE ROOTS OF A QUADRATIC EQUATION: a*x^2 + b*x + c = 0");
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        System.out.println("Given equation: " + a + "*x^2 + " + b + "*x + " + c + " = 0");

        PhuongTrinhBacHai_1 qe = new PhuongTrinhBacHai_1(a, b, c);
        if (qe.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + qe.getRoot1() + " and " + qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + qe.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}


