package Logic;

import java.util.Scanner;

public class MenuOpption {
public static BanksLogic banksLogic = new BanksLogic();
public static CustumLogic custumLogic = new CustumLogic();
    public void menu() {
        while (true) {
            printMenuOptions();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    custumLogic.inputCustumer();
                    break;
                case 2:
                    custumLogic.printCustumers();
                    break;
                case 3:
                    banksLogic.infputNewBank();
                    break;
                case 4:
                    banksLogic.printBanks();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    return;
            }
        }
    }

    private int chooseFunction() {
        System.out.print("Xin mời chọn chức năng: ");
        int functionChoice;
        while (true) {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 10) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        }
        return functionChoice;
    }

    private void printMenuOptions() {
        System.out.println("=======PHẦN MỀM QUẢN LÝ NGÂN HÀNG======");
        System.out.println("1. Khách hàng mới");
        System.out.println("2. Hiển thị danh sách khách hàng");
        System.out.println("3. Thêm ngân hàng mới");
        System.out.println("4. Hiển thị danh sách ngân hàng ");
        System.out.println("5. Tạo thông tin ngân hàng của khách ");
        System.out.println("6. In Danh sách thông tin ngân hàng ");
        System.out.println("7. Sắp xếp theo tên KH.");
        System.out.println("8. Sắp xếp theo tiền gửi ");
        System.out.println("9. Tổng số tiền gửi của mỗi KH ");
        System.out.println("10. Thoát");
    }

}
