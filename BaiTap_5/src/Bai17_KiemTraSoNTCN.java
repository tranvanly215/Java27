import java.util.Scanner;

public class Bai17_KiemTraSoNTCN {
    public static void main(String[] args) {
        System.out.println("Nhap vao so n");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao so m");
        int m = new Scanner(System.in).nextInt();
        timUCLN(n,m);
    }

    public static void timUCLN(int a, int b) {
        int r1 = a % b;
        int r2 = b % a;
        if (a >= b) {
            while (r1 != 0) {
                a = b;
                b = r1;
                r1 = a % b;
            }
            System.out.println("UCLN la " + b);
            String kiemTra1 = (b == 1) ? "Hai so Nguyen To cung nhau" : "Hai So Nguyen To KHONG cung nhau";
            System.out.println(kiemTra1);
        } else {
            while (r2 != 0) {
                b = a;
                a = r2;
                r2 = b % a;
            }
            System.out.println("UCLN la " + a);
            String kiemTra2 = (a == 1) ? "Hai so Nguyen To cung nhau" : "Hai So Nguyen To KHONG cung nhau";
            System.out.println(kiemTra2);
        }
    }
}
