import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bai26_CountX {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        countX(myArray);
    }

    public static int[] inputArray() {
        System.out.println("Nhap so phan tu mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap gia tri cho phan tu " + i + " cua mang: ");
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }

    public static void countX(int[] array) {
        System.out.println("Nhap phan tu x");
        int x = new Scanner(System.in).nextInt();
        int couter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                couter++;
            }
        }
        if (couter == 0) {
            System.out.println("Khong co " + x + " xuat hien trong mag");
        } else
            System.out.print("So lan xuat hien cua " + x + " la: " + couter);
    }
}
