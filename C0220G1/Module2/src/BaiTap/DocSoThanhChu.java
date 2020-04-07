package BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap so nguyen co toi da 3 chu so:");
            int num = scanner.nextInt();
            int a = (int) (Math.round(num / 100));
            int b = (int) (Math.round(num / 10) - a * 10);
            int c = num - 100 * a - 10 * b;
            String aStr = "", bStr = "", cStr = "";
            switch (a) {
                case 0:
                    aStr = "";
                    break;
                case 1:
                    aStr = "One hundred";
                    break;
                case 2:
                    aStr = "Two hundred";
                    break;
                case 3:
                    aStr = "Three hundred";
                    break;
                case 4:
                    aStr = "Four hundred";
                    break;
                case 5:
                    aStr = "Five hundred";
                    break;
                case 6:
                    aStr = "Six hundred";
                    break;
                case 7:
                    aStr = "Seven hundred";
                    break;
                case 8:
                    aStr = "Eight hundred";
                    break;
                case 9:
                    aStr = "Nine hundred";
                    break;
            }
            switch (b) {
                case 0:
                    bStr = "";
                    break;
                case 1:
                    bStr = "";
                    switch (c) {
                        case 0:
                            cStr = "ten";
                            break;
                        case 1:
                            cStr = "eleven";
                            break;
                        case 2:
                            cStr = "twelve";
                            break;
                        case 3:
                            cStr = "thirteen";
                            break;
                        case 4:
                            cStr = "fourteen";
                            break;
                        case 5:
                            cStr = "fifteen";
                            break;
                        case 6:
                            cStr = "sixteen";
                            break;
                        case 7:
                            cStr = "seventeen";
                            break;
                        case 8:
                            cStr = "eighteen";
                            break;
                        case 9:
                            cStr = "nineteen";
                            break;
                    }
                    break;
                case 2:
                    bStr = "twenty";
                    break;
                case 3:
                    bStr = "thirty";
                    break;
                case 4:
                    bStr = "fourty";
                    break;
                case 5:
                    bStr = "fifty";
                    break;
                case 6:
                    bStr = "sixty";
                    break;
                case 7:
                    bStr = "seventy";
                    break;
                case 8:
                    bStr = "eighty";
                    break;
                case 9:
                    bStr = "ninety";
                    break;
            }
            if (b != 1) {
                switch (c) {
                    case 1:
                        cStr = "one";
                        break;
                    case 2:
                        cStr = "two";
                        break;
                    case 3:
                        cStr = "three";
                        break;
                    case 4:
                        cStr = "four";
                        break;
                    case 5:
                        cStr = "five";
                        break;
                    case 6:
                        cStr = "six";
                        break;
                    case 7:
                        cStr = "seven";
                        break;
                    case 8:
                        cStr = "eight";
                        break;
                    case 9:
                        cStr = "nine";
                        break;
                    case 0:
                        cStr = "";
                        break;
                }
            }
            if (aStr.equals("")) {
                if (bStr.equals("")) {
                    System.out.println(cStr);
                    if (cStr.equals("")){
                        System.out.println("nhap lai so nguyen duong toi da 3 chu so");
                    }
                } else {
                    System.out.println(bStr + " " + cStr);
                }
            } else {
                if (bStr.equals("")) {
                    if (cStr.equals("")){
                        System.out.println(aStr);
                    }else {System.out.println(aStr + " and " + cStr);}
                }else {
                    System.out.println(aStr+" and "+bStr+" "+cStr);
                }
            }
        }
    }
}
