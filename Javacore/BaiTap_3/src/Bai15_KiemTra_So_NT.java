import java.util.Scanner;

public class Bai15_KiemTra_So_NT {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        int couter = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                couter = couter + 1;
            }
        }
        if (n <= 1) {
            System.out.println(n + " không phải số nguyên tố");
        } else if (couter > 2) {
            System.out.println(n + " không phải số nguyên tố");
        } else {
            System.out.println(n + " là số nguyên tố");
        }
    }
}



