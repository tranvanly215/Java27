package Entity;

import Contant.CustumKind;

import java.util.Scanner;

public class Custumer {
    private static int AUTO_ID = 10000;
    private int id;
    private String name;
    private String address;
    private String phoneNmber;
    private CustumKind custumKind;

    public Custumer() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

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

    public String getPhoneNmber() {
        return phoneNmber;
    }

    public void setPhoneNmber(String phoneNmber) {
        this.phoneNmber = phoneNmber;
    }

    public CustumKind getCustumKind() {
        return custumKind;
    }

    public void setCustumKind(CustumKind custumKind) {
        this.custumKind = custumKind;
    }

    @Override
    public String toString() {
        return "Custumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNmber='" + phoneNmber + '\'' +
                ", custumKind=" + custumKind.getValue() +
                '}';
    }

    public void inputInfor() {
        System.out.println("Nhập tên KH: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập SĐT: ");
        this.setPhoneNmber(new Scanner(System.in).nextLine());
        System.out.println("Xin chọn loại khách hàng: ");
        System.out.println("1. Cá nhân");
        System.out.println("2. Tập thể");
        System.out.println("3. Doanh nghiệp");
        int choose;
        while (true) {
            choose = new Scanner(System.in).nextInt();
            if (choose > 0 && choose <= 3) {
                break;
            }
            System.out.println("Vui lòng chọn từ 1 tới 3 như trên");
        }
        switch (choose) {
            case 1:
                this.setCustumKind(CustumKind.CN);
                break;
            case 2:
                this.setCustumKind(CustumKind.TT);
                break;
            case 3:
                this.setCustumKind(CustumKind.DN);
                break;
        }

    }
}
