package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        System.out.print("Enter a size x:");
        size = scanner.nextInt();
        int[] arr=new int[size];
        for (int i=0;i < arr.length;i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
