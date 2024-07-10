import java.util.Arrays;
import java.util.Scanner;

public class Bai4_TimViTriCungGiaTri {
    public static void main(String[] args) {
        int[] array = inPutarray();
        System.out.println(Arrays.toString(array));
        soSanh(array);

    }

    public static int[] inPutarray() {
        System.out.print("Nhập vào số phần tử N ");
        int n = new Scanner(System.in).nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + i + " gia tri: ");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        return myArray;
    }

    public static void soSanh(int[] array) {
        int couter = 0;
        for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == array[i+1]) {
                    couter = couter + 1;
            }
        }
        System.out.println("So phan tu giong nhau lien tiep la " + couter);
    }
}
