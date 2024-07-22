package Emtity;

import java.util.Scanner;

public class Nguoi {
    protected String name;
    protected String address;
    protected String phoneNumber;


    ///GetSet thong tin
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /////Ham nhap thong tin
    public void inputInfor() {
        System.out.print("Nhập họ và tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chi: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhập SDT: ");
        this.setPhoneNumber(new Scanner(System.in).nextLine());
    }


}
