import java.util.Scanner;

public class Bai12_SoChinhPhuong {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        int counter =0;
        System.out.print("Số chính phương trong khoảng gồm: ");
        for (int i = 0;i<=Math.sqrt(m);i++) {
            if (i * i >= n) {
                if (i * i <= m) {
                    System.out.print(i * i + " ");
                    counter = counter + 1;
                }

            }
        }
        System.out.println();
        System.out.println("Có " + counter + " số chính phương trong khoảng");
    }
}
