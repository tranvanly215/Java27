package Entity;

import java.util.Scanner;

public class Banks {
    private static int AUTO_ID = 100;
    private int id;
    private String bankName;
    private float rate;

    public Banks() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Banks{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", rate=" + rate +
                '}';
    }

    public void inputBankInfor() {
        System.out.println("Nhập tên Ngân hàng: ");
        this.setBankName(new Scanner(System.in).nextLine());
        System.out.println("Nhập lãi suất tiền gửi của NH: ");
        this.setRate(new Scanner(System.in).nextFloat());
    }

}
