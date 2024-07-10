import java.util.Arrays;
import java.util.Scanner;

public class Bai07_KiemTraDoiXung {
    public static void main(String[] args) {
        int [] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));
        kiemTraMangDoiXung(myArray);
    }
    public static int[] inputArray(){
        System.out.println("Nhap vao so phan tu n cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i +" cua mang: " + "\t");
            mang[i]= new Scanner(System.in).nextInt();
        }
        return mang;
    }
    public static void kiemTraMangDoiXung(int[] array){
        boolean test = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[array.length-1-i]){
                test = true;
            }  else {
                test = false;
            }
        }
        String s = test ? " Mang Doi Xung" : "Mang Bat Doi xung";
        System.out.println(s);
    }
}
