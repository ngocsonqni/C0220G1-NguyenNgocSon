package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] arr= new int[2][2];
        int[] arr2=new int[2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println("nhap vao phan tu a["+i+"]["+j+"] : ");
                arr[i][j]=scanner.nextInt();
            }
        }
        int i=0;
        do {
            for (int num : arr[i]) {
                System.out.println(num);
            }
            i++;
        }while (i<arr.length);
    }

}
