package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static int nhapSize (){
        int size;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        return size;
    }
    public static void nhapMang(int size,int[] array){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
    }
    public static void main(String[] args) {
        int size1,size2,size3;
        int[] array1,array2,array3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai mang 1");
        size1=nhapSize();
        array1=new int[size1];
        nhapMang(size1,array1);
        System.out.println("nhap chieu dai mang 2");
        size2=nhapSize();
        array2=new int[size2];
        nhapMang(size2,array2);
        size3=size1+size2;
        array3=new int[size3];
        for (int i=0;i<size1;i++){
            array3[i]=array1[i];
        }
        for (int i=size1;i<size3;i++){
            array3[i]=array2[i-size1];
        }
        System.out.print("mang 1: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.println();
        System.out.print("mang 2: ");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
        System.out.println();
        System.out.print("mang 3: ");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "\t");
        }
    }
}
