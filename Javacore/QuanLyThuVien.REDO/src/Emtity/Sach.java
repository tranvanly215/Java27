package Emtity;

import Constan.ChuyenNganh;

import java.util.Scanner;

public class Sach {

    private static int AUTO_ID = 10000;

    private int id;
    private String name;
    private String tacGia;
    private ChuyenNganh chuyenNganh;
    private int namXuatBan;
    public Sach(){
        this.id=AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }
    ///Khong cos Set Id vif AuTO ID


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Emtity.Sach{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", chuyenNganh=" + chuyenNganh.getValue() +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
    public void inputBookInfor() {
        System.out.println("Nhập tên sách: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập tác giả của sách: ");
        this.setTacGia(new Scanner(System.in).nextLine());
        System.out.println("Nhập năm xuất bản của sách: ");
        this.setNamXuatBan(new Scanner(System.in).nextInt());
        System.out.println("Lựa chọn chuyên ngành của sách:");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học – Nghệ thuật");
        System.out.println("3. Điện tử Viễn thông");
        System.out.println("4. Công nghệ thông tin");
        int chuyenNganh;
        while (true) {
            chuyenNganh = new Scanner(System.in).nextInt();
            if (chuyenNganh >= 1 && chuyenNganh <= 4) {
                break;
            }
            System.out.print("Vui lòng chọn lại từ 1-4: ");
        }
        switch (chuyenNganh) {
            case 1:
                this.setChuyenNganh(ChuyenNganh.KHTN);
                break;
            case 2:
                this.setChuyenNganh(ChuyenNganh.VHNT);
                break;
            case 3:
                this.setChuyenNganh(ChuyenNganh.DTVT);
                break;
            case 4:
                this.setChuyenNganh(ChuyenNganh.CNTT);
                break;
        }
    }
}
