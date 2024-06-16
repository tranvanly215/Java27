import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        System.out.println("Nhập vào chiều dài hình chữ nhật");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào chiều dài rộng chữ nhật");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Chu vi cua hinh chu nhat la:  " + 2*(a+b));
        System.out.println("Dien tich hinh chu nhat la: " + a*b);

    }
}
