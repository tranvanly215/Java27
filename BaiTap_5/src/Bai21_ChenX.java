import java.util.Arrays;
import java.util.Scanner;

public class Bai21_ChenX {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));
        chenPhanTuX(myArray);
    }

    public static int[] inputArray() {
        System.out.println("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu " + i + " cua mang: ");
            array[i] = new Scanner(System.in).nextInt();

        }
        return array;
    }

    public static void chenPhanTuX(int[] mang) {
        System.out.print("Nhap phan tu can chen: ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("Nhap vi tri can chen k < n: ");
        int k = new Scanner(System.in).nextInt();
        int[] mang2 = new int[mang.length + 1];
        mang2[k] = x;
        for (int i = 0; i < k; i++) {
            mang2[i]= mang[i];
        }
        for (int i = k; i < mang2.length-1; i++) {
            mang2[i+1]=mang[i];
        }
        System.out.println(Arrays.toString(mang2));
    }
}
