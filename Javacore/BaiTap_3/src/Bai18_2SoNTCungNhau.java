import java.util.Scanner;

public class Bai18_2SoNTCungNhau {
    public static void main(String[] args) {
        System.out.println("Nhập số m");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập số n");
        int n = new Scanner(System.in).nextInt();
        int r1 = m % n;
        int r2 = n % m;

        if (m > n) {
            while (r1 != 0) {
                m = n;
                n = r1;
                r1 = m % n;
            }
            int UCLN1 = n;
            System.out.println("UCLN là : " + n);
            String Rerult1 = (UCLN1 == 1) ? "Hai số là hai số nguyên tố cùng nhau" : "Hai số là hai số nguyên tố KHÔNG cùng nhau";
            System.out.println(Rerult1);
        } else {
            while (r2 != 0) {
                n = m;
                m = r2;
                r2 = n % m;
            }
            int UCLN2 = m;
            System.out.println("UCLN là : " + m);
            String Rerult2 = (UCLN2 == 1) ? "Hai số là hai số nguyên tố cùng nhau" : "Hai số là hai số nguyên tố KHÔNG cùng nhau";
            System.out.println(Rerult2);
        }

    }
}
