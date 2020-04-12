package LopVaDoiTuong.BaiTap;

public class IllegalTriangleException_1 {

    public IllegalTriangleException_1(int a, int b, int c) throws IllegalTriangleException.IllegalRightTriangleException {
        if (a+b<c||a+c<b||b+c<a){
            throw new IllegalTriangleException.IllegalRightTriangleException("Khong phai la tam giac");
        }else{
            throw new IllegalTriangleException.IllegalRightTriangleException("la hinh tam giac");
        }
    }
}
