import contant.NganhHang;

import java.util.Scanner;

public class MatHang {
    private static  int AUTO_ID= 1000;
    private String tenHang;
    private int id;
    private int GiaBan;
    private int Soluong;
    private NganhHang nganhHang;
    public MatHang(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getId() {
        return id;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public NganhHang getNganhHang() {
        return nganhHang;
    }

    public void setNganhHang(NganhHang nganhHang) {
        this.nganhHang = nganhHang;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "tenHang='" + tenHang + '\'' +
                ", id=" + id +
                ", GiaBan=" + GiaBan +
                ", Soluong=" + Soluong +
                ", nganhHang=" + nganhHang.getValue() +
                '}';
    }
    public void nhapThongTinMatHang(){
        System.out.println("Nhap ten hang: ");
        this.setTenHang(new Scanner(System.in).nextLine());
        System.out.println("Nhap gia ban: ");
        this.setGiaBan(new Scanner(System.in).nextInt());
        System.out.println("Nhap gia ban: ");
        this.setGiaBan(new Scanner(System.in).nextInt());
        System.out.println("Nhap so luong: ");
        this.setSoluong(new Scanner(System.in).nextInt());
        System.out.println("Nhap nganh hang: ");
        System.out.println("1 Dien tu");
        System.out.println("2 Dien lanh");
        System.out.println("3 May tinh");
        System.out.println("4 Thiet bi van phong");
        int chonNganh;
        while (true){
            chonNganh = new Scanner(System.in).nextInt();
            if (chonNganh>=1 && chonNganh<=4){
                break;
            }
            System.out.println("Vui long chon tu 1 - 4: ");
        }
        switch (chonNganh){
            case 1:
                this.setNganhHang(NganhHang.DT);
                break;
            case 2:
                this.setNganhHang(NganhHang.DL);
                break;
            case 3:
                this.setNganhHang(NganhHang.MT);
                break;
            case 4:
                this.setNganhHang(NganhHang.TBVP);
        }
    }
}
