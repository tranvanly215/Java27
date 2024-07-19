import java.util.Scanner;

public class Main {

    public void menu(){
        while (true){
            menuOption();
            int funtionChoose = chonMenu();
            switch (funtionChoose){
                case 1:
                    LogicProduct.nhapThongTinHangMoi();
                    break;
                case 2:
                    LogicProduct.printProduct();
                    break;
                case 3:
                    LogicStaff.inputnewStaff();
                    break;
                case 4:
                    LogicStaff.printStaff();
                    break;
                case 5:
                    System.out.println("Chuc nang 1");
                    break;
                case 6:
                    System.out.println("Chuc nang 1");
                    break;
            }
        }
    }



    public int chonMenu(){
        System.out.println("Vui long chon chuc nang: ");
        int choose;
        while (true){
            choose = new Scanner(System.in).nextInt();
            if ( choose>=1 && choose<=9){
                break;
            }
            System.out.println("Vui long chon tu 1-9");
        }
        return choose;
    }
    private void menuOption(){

        System.out.println("===PHAN MEM QUAN LI BAN HANG======");
        System.out.println("1. Nhap thong tin mat hang moi");
        System.out.println("2. In thong tin mat hang");
        System.out.println("3. Nhap thong tin nhan vien.");
        System.out.println("4. In thong tin nhan vien");
        System.out.println("5. Danh Sach ban hangf cua nhan vien");
        System.out.println("6. In danh sach ban hang cua NV");
        System.out.println("7. In danh sach ban hang theo ten NV");
        System.out.println("8. In thong tin theo mat hang");
        System.out.println("9. In doanh thu NV");
        System.out.println("10. Thoat");

    }





}
