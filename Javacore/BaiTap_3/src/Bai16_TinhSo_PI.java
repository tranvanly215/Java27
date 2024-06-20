import java.util.Scanner;

public class Bai16_TinhSo_PI {
    public static void main(String[] args) {
        System.out.print("Nhập số c lớn hơn 0: ");
        float c = new Scanner(System.in).nextFloat();
        double PI;
        double Sum = 0;
        for (int n = 0; (double) 1 /(2*n+1)>c; n++){
            double Sub = Math.pow(-1,n)*1/(2*n +1);
            Sum  = Sum + Sub;
        }
        PI = 4* Sum;
        System.out.println("Số PI là: ");
        System.out.println(PI);

    }
}
