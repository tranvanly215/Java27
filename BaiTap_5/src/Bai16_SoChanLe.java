import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bai16_SoChanLe {
    public static void main(String[] args) {
        System.out.println("Nhap vao so n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Cac so nho hon " + n + " la so chan gom: ");
        timSoChan(n);
        System.out.println();
        System.out.print("Cac so nho hon " + n + " la so le gom: ");
        timSoLe(n);
    }

    public static void timSoChan(int a) {
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    public static void timSoLe(int b) {
        for (int i = 0; i < b; i++) {
            if (i % 2 != 0)
                System.out.print(i + "\t");
        }
    }
}
