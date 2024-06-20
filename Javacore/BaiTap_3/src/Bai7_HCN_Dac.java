import java.util.Scanner;

public class Bai7_HCN_Dac {
    public static void main(String[] args) {
        System.out.println("Nhập vào số n ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số m ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
