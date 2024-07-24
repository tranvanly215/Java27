package Logic;

import Entity.Banks;

import java.util.Scanner;

public class BanksLogic {
    public Banks[] banks = new Banks[1000];
    public  int BanksLength(){
        return banks.length;
    }
    public void infputNewBank(){
        System.out.println("Nhập số lượng NH cần thêm mới");
        int bankCount = new Scanner(System.in).nextInt();
        for (int i = 0; i < bankCount; i++) {
            System.out.println("Nhập thông tin cho ngân hàng thứ " + (i + 1));
            Banks bank = new Banks();
            bank.inputBankInfor();
            saveBank(bank);
        }
    }
    public void saveBank(Banks book) {
        for (int j = 0; j < banks.length; j++) {
            if (banks[j] == null) {
                banks[j] = book;
                break;
            }
        }
    }
    public void printBanks() {
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] == null) {
                continue;
            }
            System.out.println(banks[i]);
        }
    }
    public boolean kiemTraNganHang() {
        boolean kiemTraNH = false;
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] != null) {
                kiemTraNH = true;
                break;
            }
        }
        return kiemTraNH;
    }
    public Banks searchBanksById(int banksId) {
        for (int j = 0; j < banks.length; j++) {
            if (banks[j] != null && banksId == banks[j].getId()) {
                return banks[j];
            }
        }
        return null;
    }
}
