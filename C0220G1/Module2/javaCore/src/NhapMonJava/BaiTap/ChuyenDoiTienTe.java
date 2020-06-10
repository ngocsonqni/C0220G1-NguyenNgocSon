package NhapMonJava.BaiTap;

import java.util.ArrayList;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("aaa");
        System.out.println(arrayList.get(0).equals(arrayList.get(1)));
    }
}