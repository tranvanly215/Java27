import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai25_DemsoChanLe {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));
        demChanle(myArray);
    }
    public static int[] inputArray(){
        System.out.println("Nhap so phan tu mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap gia tri cho phan tu " + i+ " cua mang: ");
            array[i]= new Scanner(System.in).nextInt();
        }
        return array;
    }
    public static void demChanle(int [] array){
        int demChan = 0;
        int demLe= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                demChan++;
            } else {
                demLe++;
            }
        }
        System.out.println("So phan tu la so chan la: "+ demChan);
        System.out.println("So phan tu la so le la: "+ demLe);
    }
}
