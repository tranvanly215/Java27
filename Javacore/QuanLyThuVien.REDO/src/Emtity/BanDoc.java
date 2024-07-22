package Emtity;

import Constan.LoaiBanDoc;

import java.util.Scanner;

public class BanDoc  extends Nguoi {
    private static int AUTO_ID = 10000;
    private  int id;
    private LoaiBanDoc loaiBanDoc;
    public BanDoc(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }
////////////////////////////////////
    ///AUTO ID nen khong co SET id
    public int getId() {
        return id;
    }

    public LoaiBanDoc getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(LoaiBanDoc loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    @Override
    public String toString() {
        return "Emtity.BanDoc{" +
                "id=" + id +
                ", loaiBanDoc=" + loaiBanDoc.getValue() +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    public void inputInfor() {
        super.inputInfor();
        System.out.println("Chọn loại bạn đọc");
        System.out.println("1. Sinh viên");
        System.out.println("2. Học viên cao học");
        System.out.println("3. Giảng viên");
        int type;
        while (true) {
            type = new Scanner(System.in).nextInt();
            if (type >= 1 && type <= 3) {
                break;
            }
            System.out.print("Vui long chon lai tu 1 toi 3: ");
        }
        switch (type) {
            case 1:
                this.setLoaiBanDoc(LoaiBanDoc.HS);
                break;
            case 2:
                this.setLoaiBanDoc(LoaiBanDoc.HVCH);
                break;
            case 3:
                this.setLoaiBanDoc(LoaiBanDoc.GV);
                break;

        }
    }
}
