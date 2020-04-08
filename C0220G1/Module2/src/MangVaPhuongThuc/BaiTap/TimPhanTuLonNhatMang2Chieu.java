package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int sizeX,sizeY;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size x:");
        sizeX = scanner.nextInt();
        System.out.print("Enter a size y:");
        sizeY = scanner.nextInt();
        array = new int[sizeX][sizeY];
        for (int i=0;i<sizeX;i++){

            for (int j=0;j<sizeY;j++){
                System.out.print("Enter element " + i + "," + j + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < sizeX; i++) {
            for (int j=0;j<sizeY;j++){
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The largest property value in the list is " + max );
    }
}
