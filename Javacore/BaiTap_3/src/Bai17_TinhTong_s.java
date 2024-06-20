import java.util.Scanner;

public class Bai17_TinhTong_s {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên N");
        int n = new Scanner(System.in).nextInt();
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (float) 1 /i;
        }
        System.out.print("Tổng s là : ");
        System.out.println(s);

    }
}
