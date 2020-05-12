package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoO1Cot {
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
        System.out.println("vi tri cot muon tinh tong");
        int cot=scanner.nextInt()-1;
        for (int i=0;i<sizeX;i++){
            sum+=array[i][cot];
        }
        for (int i=0;i<sizeX;i++){
            for (int j=0;j<sizeY;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Tong cac so o cot thu "+(cot+1)+" la "+sum);
    }
}
