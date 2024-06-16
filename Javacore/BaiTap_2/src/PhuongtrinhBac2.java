import java.util.Scanner;

public class PhuongtrinhBac2 {
    public static void main(String[] args) {
        System.out.println("Nhap so a khac 0");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhap so b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhap so c");
        int c = new Scanner(System.in).nextInt();
        int delta = b * b - 4 * a * c;
        //System.out.println(delta);//
        String ketqua1 = (delta < 0) ? "Phuong trinh vo nghiem" : "Phuong trinh có nghiem";
        System.out.println(ketqua1);
        double x1 = (-b+ Math.sqrt(delta))/(2*a);
        double x2 = (-b- Math.sqrt(delta))/(2*a);
        System.out.println( "X1 la: " + x1);
        System.out.println("X2 la: " + x2);
       }
}