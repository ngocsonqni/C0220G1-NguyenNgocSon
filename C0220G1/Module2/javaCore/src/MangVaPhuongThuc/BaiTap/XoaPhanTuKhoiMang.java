package MangVaPhuongThuc.BaiTap;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= new int[10];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("nhap vao vi tri index can xoa X vao trong mang:");
        int xIndex=scanner.nextInt();
        if (xIndex<0 || xIndex>(array.length-1)){
            System.out.println("Khong xoa duoc phan tu vao mang");
        }else{
            for (int a=xIndex;a<(array.length-1);a++){
                array[a]=array[a+1];
            }
        }
        System.out.printf("%-20s%s", "Array sau khi chen X: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
