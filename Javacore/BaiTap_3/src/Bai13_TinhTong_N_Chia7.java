import java.util.Scanner;

public class Bai13_TinhTong_N_Chia7 {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        int i = 0;
        while (i <= n) {
            if (i % 7 == 0) {
                S = S + i;
            }
            i++;
        }
        System.out.println("Tổng các số không lớn hơn " + n + " chia hết cho bảy là: " + S);
    }
}
