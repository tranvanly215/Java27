import entity.ConNguoi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NhanVienBanHang extends ConNguoi {

    public static int AUTO_ID = 1000;
    private int id;
    private LocalDate ngayKiHopDong;
    public NhanVienBanHang(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public LocalDate getNgayKiHopDong() {
        return ngayKiHopDong;
    }

    public void setNgayKiHopDong(LocalDate ngayKiHopDong) {
        this.ngayKiHopDong = ngayKiHopDong;
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +
                "id=" + id +
                ", ngayKiHopDong=" + ngayKiHopDong +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    public void inputInfor(){
        super.inputInfor();
        System.out.println("Nhap ngay thang ki hop dong theo dinh dang dd/MM/yyyy: ");
        String date= new Scanner(System.in).nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.setNgayKiHopDong(LocalDate.parse(date,formatter));
    }
}
