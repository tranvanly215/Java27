import java.util.Scanner;

public class Bai11_TinhTong_S {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0; //tong so tu nhien n
        int s1 = 0; //tong so le
        int s2 = 0; //tong so chan
        for (int i = 1; i <= n; i++) {
            s = s + i;
            if (i % 2 == 0) {
                s2 = s2 + i;
            } else {
                s1 = s1 + i;
            }
        }
        System.out.println("Tổng S là: " + s);
        System.out.println("Tổng số lẻ là: " + s1);
        System.out.println("Tổng số chẵn là: " + s2);
    }
}
