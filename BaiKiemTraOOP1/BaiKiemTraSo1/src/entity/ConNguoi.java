package entity;

import java.util.Scanner;

public class ConNguoi {
    protected String name;
    protected String address;
    protected String phoneNumber;

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
    public void inputInfor() {
        System.out.print("Nhap ho ten: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhap dia chi: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhap so dien thoai: ");
        this.setPhoneNumber(new Scanner(System.in).nextLine());
    }
}
