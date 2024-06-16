import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        System.out.println("Xin moi nhap so a khac 0");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Xin moi nhap so b:");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Ket qua cua phuong trinh x = " + (-(float) b / a));

    }
}
