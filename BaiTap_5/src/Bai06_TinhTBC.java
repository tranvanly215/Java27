import java.util.Arrays;
import java.util.Scanner;

public class Bai06_TinhTBC {
    public static void main(String[] args) {
        int [] mang = inputArray();
        System.out.println(Arrays.toString(mang));
        trungBinhCong(mang);
    }
    public static int [] inputArray(){
        System.out.println("Nhap vao so phan tu n: ");
        int n = new Scanner(System.in).nextInt();
        int [] mang = new int[n];
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Nhap vao phan tu thu "+ i+ " cua day so: "+ "\t");
            mang[i] = new Scanner(System.in).nextInt();
        }
        return mang;
    }
    public static void trungBinhCong( int[] array){
        System.out.print("Nhap vao so b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhap vao so c: ");
        int c = new Scanner(System.in).nextInt();
        int sum = 0;
        int couter =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=b){
                if (array[i]<= c){
                    sum=sum +array[i];
                    couter ++;
                }
            }
        }
        System.out.println("Trung binh cong cua so thoa man la: " + (float)sum/couter);

    }
}

