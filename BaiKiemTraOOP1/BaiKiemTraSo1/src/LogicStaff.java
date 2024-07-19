import java.util.Scanner;

public class LogicStaff {
    private static NhanVienBanHang[] staffs = new NhanVienBanHang[1000];

    public static void printStaff(){
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i]==null){
                continue;
            }
            System.out.println(staffs[i]);

        }
    }

    static void inputnewStaff(){
        System.out.println("Nhap so luong nhan vien moi");
        int staffNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < staffNum; i++) {
            System.out.println("Nhap thong tin cua nhan vien thu "+ (i+1)+" :");
            NhanVienBanHang staff = new NhanVienBanHang();
            staff.inputInfor();

        }
    }
    private void SaveStaff(NhanVienBanHang staff){
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] == null){
                staffs[i] = staff;
                break;
            }

        }
    }
}
