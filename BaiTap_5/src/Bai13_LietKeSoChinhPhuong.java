import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bai13_LietKeSoChinhPhuong {
    public static void main(String[] args) {
        System.out.print("Nhap vao so nguyen m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhap vao so nguyen n > m: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("So chinh phuong gom: ");
        kiemTraSCP(m,n);
    }

    public static void kiemTraSCP(int a, int b) {
        for (int i = 0; i < b / 2; i++) {
            if (i * i >= a) {
                if (i * i <= b) {
                    System.out.print(i * i +"\t");
                }
            }
        }
    }
}
