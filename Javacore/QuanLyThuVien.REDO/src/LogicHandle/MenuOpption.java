package LogicHandle;

import java.util.Scanner;

public class MenuOpption {
    private static final BookLogic bookLogic = new BookLogic();
    private static final ReaderLogic readerLogic = new ReaderLogic();
    private static final BookBorrowLogicHandle bookBorrowLogicHandle = new BookBorrowLogicHandle(bookLogic, readerLogic);


    public void menu() {
        while (true) {
            printMenuOptions();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    bookLogic.inputNewBook();
                    break;
                case 2:
                    bookLogic.printBooks();
                    break;
                case 3:
                    readerLogic.inputNewReader();
                    break;
                case 4:
                    readerLogic.printReaders();
                    break;
                case 5:
                    bookBorrowLogicHandle.creatBoookOrder();
                    break;
                case 6:
                    bookBorrowLogicHandle.printBookBorrowOrder();
                    break;
                case 7:
                    bookBorrowLogicHandle.sapXep();
                    break;
                case 8:
                    bookBorrowLogicHandle.timSachTheoTen();
                    break;
                case 9:
                    return;
            }
        }
    }

    private int chooseFunction() {
        System.out.print("Xin mời chọn chức năng: ");
        int functionChoice;
        while (true) {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 9) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        }
        return functionChoice;
    }

    private void printMenuOptions() {
        System.out.println("=======PHẦN MỀM QUẢN LÝ MƯỢN SÁCH THƯ VIỆN======");
        System.out.println("1. Thêm mới sách vào kho.");
        System.out.println("2. Hiển thị danh sách các cuốn sách mà thư viện đang có.");
        System.out.println("3. Đăng ký tài khoản cho bạn đọc mới.");
        System.out.println("4. Hiển thị danh sách các bạn đọc có trong thư viện.");
        System.out.println("5. Lập bảng quản lý mượn sách.");
        System.out.println("6. In danh sách lượt mượn sách.");
        System.out.println("7. Sắp xếp bảng quản lý mượn sách.");
        System.out.println("8. Tìm kiếm và hien thị danh sách mượn sách theo tên bạn đọc");
        System.out.println("9. Thoát");
    }

}
