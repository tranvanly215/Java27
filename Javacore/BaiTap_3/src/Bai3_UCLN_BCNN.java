import java.util.Scanner;

public class Bai3_UCLN_BCNN {
    public static void main(String[] args) {
        System.out.print("Nhập vào số a:  ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào số b:  ");
        int b = new Scanner(System.in).nextInt();

        int a1 = a;
        int b1 = b;
        int r1 = a % b;
        int r2 = b % a;
        if (a > b)  {
            while (r1 != 0) {
                a = b;
                b = r1;
                r1 = a % b;
            }
            System.out.println("UCLN của hai số là: " + b);
            System.out.println("BCNN của hai số là: " + ((a1*b1)/b) );
        } else {
            while (r2 != 0) {
                b = a;
                a = r2;
                r2 = b % a;
            }
            System.out.println("UCLN của hai số là: " + a);
            System.out.println("BCNN của hai số là: " + ((a1*b1)/a) );
        }
    }

}

