import java.util.Arrays;
import java.util.Scanner;

public class Bai24_SapXepMangGiamDan {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));
        sapXepMang(myArray);
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

    public static void sapXepMang(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i +1; j < array.length; j++) {
            if (array[j] > array[i]) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            }
        }
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(array));
    }
}
