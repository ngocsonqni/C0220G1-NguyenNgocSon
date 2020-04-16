package CauTrucDuLieuVaGiaiThuat.BaiTap.ArrayList;
import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        listInteger.add(0);
        listInteger.add(1);
        System.out.println("element 0: "+listInteger.get(0));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println();
        Object[] listInteger2;
        listInteger2=listInteger.clone();
        for (int i=0;i<listInteger.size();i++){
            System.out.println("element clone "+i+": "+listInteger2[i]);
        }

    }
}
