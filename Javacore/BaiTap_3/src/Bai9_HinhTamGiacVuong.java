import java.util.Scanner;

public class Bai9_HinhTamGiacVuong {
    public static void main(String[] args) {
        System.out.println("Nhập chiều cao hình tam giác: ");
       int a = new Scanner(System.in).nextInt();
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
