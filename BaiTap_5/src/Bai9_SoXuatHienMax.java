import java.util.Arrays;
import java.util.Scanner;

public class Bai9_SoXuatHienMax {
    public static void main(String[] args) {
int[] myArray = inputArray();
        System.out.println("Mang duoc tao: "+ Arrays.toString(myArray));
        System.out.println("Cac phan tu khac nhau gom: ");
        kiemTra(myArray);
    }
    public static int[] inputArray(){
        System.out.println("Nhap so phan tu mang: ");
        int n = new Scanner(System.in).nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("Nhap phan tu thu " + i+ " cua mang: "+ "\t");
            array[i]= new Scanner(System.in).nextInt();

        }
        return array;
    }
    public static void kiemTra(int [] myArray){
        for (int i = 0; i < myArray.length-1 ; i++) {
            for (int j = 1; j < myArray.length ; j++) {
            if (myArray[i] != myArray[j]){
                System.out.println(myArray[i]);
            }
            }

        }
    }
}
