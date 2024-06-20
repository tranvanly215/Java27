import java.util.Scanner;

public class Bai1_TimMax {
    public static void main(String[] args) {
        System.out.print("Nhập và số a:  ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập và số b:  ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhập và số c:  ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Nhập và số d:  ");
        int d = new Scanner(System.in).nextInt();
        int max1, max2;
        max1 = Math.max(a,b);
        max2 = Math.max(c,d);
        if (max1 > max2){
            System.out.println("Số lớn nhất là số:  " + max1);
        } else {
            System.out.println("Số lớn nhất là số:  " + max2);
        }

    }
}
