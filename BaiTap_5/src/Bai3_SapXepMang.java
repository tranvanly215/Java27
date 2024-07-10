import java.util.Arrays;
import java.util.Scanner;

public class Bai3_SapXepMang {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        System.out.println("Mang khi chua sap xep: ");
        System.out.println(Arrays.toString(myArray));
        bubbleShort(myArray);

    }

    public static int[] inputArray() {
        System.out.print("Nhập vào số phần tử mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập hần tử thứ " + i + " của mảng:" + "\t");
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }
    public static void bubbleShort(int[] myArray){
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[j] < myArray[i]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }

            }
        }
        System.out.println("Mang sau khi sap xep lai: ");
       System.out.println( Arrays.toString(myArray));
    }
}
