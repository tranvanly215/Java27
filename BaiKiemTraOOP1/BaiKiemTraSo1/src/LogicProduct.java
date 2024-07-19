import java.util.Scanner;

public class LogicProduct {
    private static MatHang[] products = new MatHang[1000];
    public static void printProduct(){
        for (int i = 0; i < products.length; i++) {
            if (products[i]==null){
                continue;
            }
            System.out.println(products[i]);

        }
    }
    public static void nhapThongTinHangMoi(){
        System.out.println("Nhap so luong mat hang moi");
        int quantity = new Scanner(System.in).nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Nhap thong tin cho mat hang moi thu" + (i+1) + "la: ");
            MatHang product= new MatHang();
            product.nhapThongTinMatHang();
            SaveProDuct(product);
        }
    }
    private static void SaveProDuct(MatHang product){
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null){
                products[i] = product;
                break;
            }

        }
    }
}
