package NhapMonJava.BaiTap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int num=2;
        int count=0;
        while (count<20){
            boolean check=false;
            for (int i=2;i<num;i++){
                if(num%i==0){
                    check=true;
                    break;
                }
            }

            if (!check){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
