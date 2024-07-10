import java.util.Arrays;
import java.util.Scanner;

public class Bai5_TimSo2Nd {
    public static void main(String[] args) {
        int[] mang = inputArray();
        System.out.println(Arrays.toString(mang));
        sapXepmang(mang);
    }
    public static int[] inputArray(){
        System.out.print("Nhap vao so phan tu cua mang: ");
        int n= new Scanner(System.in).nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu "+i+" cua mang: ");
            myArray[i]= new Scanner(System.in).nextInt();
        }
        return myArray;
    }
    //Sap xep magn theo chieu tang dan
    public static void sapXepmang(int[] mang){
        for (int i = 0; i < mang.length-1 ; i++) {
            for (int j = i+1; j < mang.length ; j++) {
                if (mang[i]< mang[j]){
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j]= temp;
                }
            }
        }
        System.out.println("Mang duoc sap xep theo chieu giam dan: "+ Arrays.toString(mang));
        if (mang[0]==mang[mang.length-1]){
            System.out.println("Mang khong co so lon thu hai");
        }
        for (int i = 0; i < mang.length-1; i++) {
            if (mang[i] == mang[i+1]){
                continue;
            }
            System.out.println("Vi tri so lon thu hai la: " + (i+1));
            return;
        }

    }
}
