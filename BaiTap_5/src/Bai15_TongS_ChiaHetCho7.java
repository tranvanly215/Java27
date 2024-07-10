import java.util.Scanner;

public class Bai15_TongS_ChiaHetCho7 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so n");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Tong S gom cac so chia het cho 7 la: ");
         int sumS7 = sum(n);
        System.out.println(sumS7);
    }
    public static int sum(int a){
        int tong  = 0;
        for (int i = 0; i <a ; i++) {
            if (i%7==0){
                tong = tong +i;
            }
        }
        return tong;
    }
}
