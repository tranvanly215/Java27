import java.util.Scanner;

public class Bai14_TinhS {
    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Tong S la: ");
        float sumS = sum(n);
        System.out.println(sumS);

    }

    public static float sum(int a) {
        float s = 0;
        for (int i = 1; i <= a; i++) {
            s = s + (float) 1 / i;
        }
        return s;
    }
}
