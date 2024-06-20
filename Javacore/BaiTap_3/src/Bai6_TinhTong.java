import java.util.Scanner;

public class Bai6_TinhTong {
    public static void main(String[] args) {
        System.out.print("Nhập dãy số n bất kì: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        int u;
        while (n > 0) {
            u = n % 10;
            S = S + u;
            n = n / 10;

        }
        System.out.println(" Tổng các chứ số là: " + S);
    }
}
