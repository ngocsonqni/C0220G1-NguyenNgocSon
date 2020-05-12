package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class TongSoODuongCheoChinhMang2Chieu {
    public static void main(String[] args) {
        int sizeX,sizeY;
        double[][] array;
        double sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size x:");
        sizeX = scanner.nextInt();
        System.out.print("Enter a size y:");
        sizeY = scanner.nextInt();
        array = new double[sizeX][sizeY];
        for (int i=0;i<sizeX;i++){
            for (int j=0;j<sizeY;j++){
                System.out.print("Enter element " + i + "," + j + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<sizeX;i++){
            for (int j=0;j<sizeY;j++){
                if (i==j || j==(sizeY-1-i)){
                    sum+=array[i][j];
                }
            }
        }
        for (int i=0;i<sizeX;i++){
            for (int j=0;j<sizeY;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Tong cac so o duong cheo chinh la "+sum);
    }
}
