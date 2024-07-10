import java.util.Arrays;
import java.util.Scanner;

public class Bai27_TinhMangMoi {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin cho mang A");
        int[] myArrayA = inputArray();
        System.out.println("Nhap thong tin cho mang B");
        int[] myArrayB = inputArray();
        System.out.println("Mang A la: ");
        System.out.println(Arrays.toString(myArrayA));
        System.out.println("Mang B la: ");
        System.out.println(Arrays.toString(myArrayB));
        System.out.println("Ket qua tong hai mang: ");
        tinhSMang(myArrayA, myArrayB);
    }
    public static int[] inputArray() {
        System.out.println("Nhap so phan tu mang : ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap gia tri cho phan tu " + i + " cua mang: ");
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }
    public static void tinhSMang(int[] a, int [] b){
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
                c[i] = a[i]+ b[b.length-1-i];

        }
        System.out.println(Arrays.toString(c));
    }
}
