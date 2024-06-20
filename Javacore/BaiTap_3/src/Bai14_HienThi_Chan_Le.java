import java.util.Scanner;

public class Bai14_HienThi_Chan_Le {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Số chẵn nhỏ hơn " + n + " gồm: ");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Số lẻ nhỏ hơn " + n + " gồm: ");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
