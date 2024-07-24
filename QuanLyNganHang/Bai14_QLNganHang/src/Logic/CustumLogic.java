package Logic;

import Entity.Custumer;

import java.util.Scanner;

public class CustumLogic {
public Custumer[] custumers = new Custumer[1000];
public int getCuzLength(){
    return custumers.length;
}
    public void printCustumers() {
        for (int i = 0; i < custumers.length; i++) {
            if (custumers[i] == null) {
                continue;
            }
            System.out.println(custumers[i]);
        }
    }
    public void inputCustumer() {
        System.out.print("Nhập số lượng khách hàng mới: ");
        int cuzNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < cuzNumber; i++) {
            System.out.println("Nhập thông tin cho bạn đọc thứ " + (i + 1));
            Custumer custumer = new Custumer();
            custumer.inputInfor();
            saveCustumer(custumer);
        }

    }
    public void saveCustumer(Custumer custumer) {
        for (int j = 0; j < custumers.length; j++) {
            if (custumers[j] != null) {
                continue;
            }
            custumers[j] = custumer;
            break;
        }
    }
    public boolean kiemTraKhachHang() {
        boolean kiemTraKH = false;
        for (int i = 0; i < custumers.length; i++) {
            if (custumers[i] != null) {
                kiemTraKH = true;
                break;
            }
        }
        return kiemTraKH;
    }
    public Custumer searchCustumerById(int readerId) {
        for (int j = 0; j < custumers.length; j++) {
            if (custumers[j] != null && readerId == custumers[j].getId()) {
                return custumers[j];
            }
        }
        return null;
    }
}
