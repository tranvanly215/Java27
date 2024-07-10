import java.util.Arrays;
import java.util.Scanner;

public class Bai20_TimMaxMin {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));
        findMax(myArray);
        findMin(myArray);
    }

    public static int[] inputArray() {
        System.out.println("Nhap So Phan tu mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap pahn tu thu " + i + " cua mang: ");
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }

    public static void findMax(int[] mang) {
        int max = 0;
        for (int i = 0; i < mang.length - 1; i++) {
            if (mang[i + 1] >= mang[i]) {
                max = mang[i + 1];
                continue;
            }

        }
        System.out.println("Gia tri so lon nhat trong mang la:" + max);
    }

    public static void findMin(int[] mang) {
        int min = 0;
        for (int i = 0; i < mang.length - 1; i++) {
            if (mang[i + 1] < mang[i]) {
                min = mang[i + 1];
                continue;
            }
        }
        System.out.println("Gia tri so nho nhat trong mang la:" + min);

    }
}