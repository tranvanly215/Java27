import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {

        //Nhap chuoi va ki tu tim vi tri cua ki tu trong chuoi//
        System.out.println("Xin moi nhap chuoi ki tu");
        String line1 = new Scanner(System.in).nextLine();
        System.out.println("Xin moi nhap ki tu");
        String text = new Scanner(System.in).nextLine();
        int position = line1.indexOf(text);
        System.out.println("Vị trí xuất hiện đầu tiên là: " + position);

        int lastPst = line1.lastIndexOf(text);
        System.out.println("Vị trí xuất hiện cuối cùng là: " + lastPst);

        //b nhap chuoi va thay the//
        System.out.println("Xin moi nhap chuoi ki tu s");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Xin moi nhap chuoi ki tu s1");
        String s1 = new Scanner(System.in).nextLine();
        System.out.println("Xin moi nhap chuoi ki tu s2");
        String s2 = new Scanner(System.in).nextLine();
        String s3 = s.replace(s1,s2);
        System.out.println("Chuoi ki tu s duoc thay the thanh:");
        System.out.println(s3);
    }
}
