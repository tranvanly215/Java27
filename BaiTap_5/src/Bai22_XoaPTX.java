import java.util.Arrays;
import java.util.Scanner;

public class Bai22_XoaPTX {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));
        delete(myArray);
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
    public static void delete(int [] array){
        System.out.println("Nhap vi tri k can xoa: ");
        int k = new Scanner(System.in).nextInt();
        int[] array2= new int[array.length-1];
        for (int i = 0; i < k; i++) {
            array2[i]= array[i];
        }
        for (int i = k; i <array2.length; i++) {
            array2[i] = array[i+1];

        }
        System.out.println(Arrays.toString(array2));
    }
}
