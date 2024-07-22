package LogicHandle;

import Emtity.BanDoc;
import Emtity.BookBorrowOrderDetail;
import Emtity.BorrowBookOrder;
import Emtity.Sach;

import java.util.Scanner;

public class BookBorrowLogicHandle {
    private BorrowBookOrder[] orders = new BorrowBookOrder[1000];
    private BookLogic bookLogic;
    private ReaderLogic readerLogic;


    public BookBorrowLogicHandle(BookLogic bookLogic, ReaderLogic readerLogic){
        this.bookLogic = bookLogic;
        this.readerLogic =readerLogic;

    }
    public void printBookBorrowOrder(){
        for (int i = 0; i < orders.length; i++) {
            if (orders[i]== null){
                continue;
            }
            System.out.println(orders[i]);
        }
    }
    public void creatBoookOrder(){
        boolean coBanDocHayChua = bookLogic.checkCoSachHayChua();
        boolean cosSachHayChua = readerLogic.checkCoBanDocHayChua();
        if (!cosSachHayChua || !cosSachHayChua){
            System.out.println("Vui long them thong tin sach va ban doc, chua co du lieu vef ban doc va sach");
            return;
        }
        System.out.println("Co bao nhieu ban doc can muon sach?: ");
        int readerNum;
        while (true){
            readerNum = new Scanner(System.in).nextInt();
            if (readerNum>0 && readerNum<= readerLogic.getReadersLength()){
            break;
            }
            System.out.println("So luong ban doc khong hop le, vui long nhap lai");
        }
        for (int i = 0; i < readerNum; i++) {
            /* la luot tra loi 3 cau hoi
         Bạn là ai?
         Bạn mượn các dau sách nào?
         Từng đầu sách bạn mượn bao nhiêu cuốn?
          */
            BanDoc banDoc = truyVanBanDoc();
            BookBorrowOrderDetail[] details = khaiBaoThongTinMuonSach();
            int total = 0;
            for (BookBorrowOrderDetail detail : details) {
                total += detail.getSoLuong();
            }

            BorrowBookOrder order = new BorrowBookOrder(banDoc, details,total);
            saveOrder(order);
        }
    }
    public void saveOrder(BorrowBookOrder order) {
        for (int j = 0; j < orders.length; j++) {
            if (orders[j] != null) {
                continue;
            }
            orders[j] = order;
            break;
        }
    }
    public BookBorrowOrderDetail[] khaiBaoThongTinMuonSach(){
        System.out.println("Nhap so dau sach ban doc muon muon: ");
        int bookNum;
        while (true){
            bookNum = new Scanner(System.in).nextInt();
            if (bookNum>0 && bookNum <= bookLogic.getBooksLength() && bookNum<=5){
                break;
            }
            System.out.println("So dau sach nhap khong phu hop hoac vuot qua 5 cuon vui long nhap lai: ");
        }
BookBorrowOrderDetail[] details =new  BookBorrowOrderDetail[bookNum];
        int count = 0;
        for (int i = 0; i < bookNum; i++) {
            Sach sach;
            while (true){
                int bookID = new Scanner(System.in).nextInt();
                sach = bookLogic.searchBookById(bookID);
                if (sach !=null){
                    break;
                }
                System.out.println("Khong co sach trong thu vien, vui long kiem tra lai");
            }
            System.out.println("Dau sach "+ sach.getName() +" muon bao nhieu quyen? ");
            int soLuongSachMuon;
            while (true){
                soLuongSachMuon = new Scanner(System.in).nextInt();
                if (soLuongSachMuon >0 && soLuongSachMuon<4){
                    break;
                }
                System.out.println("So nhap khong hop le hoac vuot qua 3 cuon tren mot dau sach vui long dieu chinh lai");
            }
            BookBorrowOrderDetail detail = new BookBorrowOrderDetail(sach , soLuongSachMuon);
            details[count] =detail;
            count++;
        }

return  details;
    }
    public BanDoc truyVanBanDoc() {
        BanDoc reader = null;
        while (true) {
            int readerId = new Scanner(System.in).nextInt();
            reader = readerLogic.searchReaderById(readerId);
            if (reader != null) {
                break;
            }
            System.out.print("Ban doc nay chua co thong tin vui long kiem tra lai ");
        }
        return reader;
    }

public  void timSachTheoTen(){
    System.out.println("Nhap ten sach ban muon tim");
    String nameBook = new Scanner(System.in).nextLine();
    for (int i = 0; i < orders.length; i++) {
        // Chuyen doi ten thanh viet thuong
        if (orders[i]!= null && orders[i].getBanDoc().getName().toLowerCase().contains(nameBook.toLowerCase()));
        System.out.println(orders[i]);
        }
    }
    public void sapXep() {
        while (true) {
            System.out.println("1. Sap xem theo ten ban doc");
            System.out.println("2. Sap xep theo luong sach");
            System.out.println("3. Quay lai");
            int choice;
            while (true) {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                }
                System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
            }
            switch (choice) {
                case 1:
                    timSachTheoTen();
                    printBookBorrowOrder();
                    break;
                case 2:
                    sapXepTheoSoLuong();
                    printBookBorrowOrder();
                    break;
                case 3:
                    return;
            }
        }
    }
    private void sapXepTheoSoLuong() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                continue;
            }
            for (int j = 0; j < orders.length; j++) {
                if (orders[j] == null) {
                    continue;
                }

//                if (orders[i].getTotalQuantity() > orders[j].getTotalQuantity()) {
                if (orders[i].getTongSoSach() > orders[j].getTongSoSach()) {
                    BorrowBookOrder temp = orders[j];
                    orders[j] = orders[i];
                    orders[i] = temp;
                }
            }
        }
    }
    private void sapXepTheoTen() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                continue;
            }
            for (int j = 0; j < orders.length; j++) {
                if (orders[j] == null) {
                    continue;
                }
                String name1 = orders[i].getBanDoc().getName().toLowerCase();
                String name2 = orders[j].getBanDoc().getName().toLowerCase();
                if (name1.compareTo(name2) > 0) {
                    BorrowBookOrder temp = orders[j];
                    orders[j] = orders[i];
                    orders[i] = temp;
                }
            }
        }
    }
}


