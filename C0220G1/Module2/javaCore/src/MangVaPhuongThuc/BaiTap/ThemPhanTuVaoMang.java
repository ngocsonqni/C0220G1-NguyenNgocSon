package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= new int[10];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("nhap vao phan tu X can chen:");
        int x=scanner.nextInt();
        System.out.println("nhap vao vi tri index can chen X vao trong mang:");
        int xIndex=scanner.nextInt();
        if (xIndex<=1 || xIndex>=(array.length-1)){
            System.out.println("Khong chen duoc phan tu vao mang");
        }else{
            for (int a=(array.length-1);a>xIndex;a--){
                array[a]=array[a-1];
            }
            array[xIndex]=x;
        }
        System.out.printf("%-20s%s", "Array sau khi chen X: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
