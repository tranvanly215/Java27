package Emtity;

import java.util.Arrays;

/*Class nay chua thong tin cuar ban doc + thong tin sach cua banj doc muon va so luong sach cua ban doc do muon*/
public class BorrowBookOrder {
    private BanDoc banDoc;
    private BookBorrowOrderDetail[] detail;
    int tongSoSach;
    public BorrowBookOrder(BanDoc banDoc, BookBorrowOrderDetail[] detail, int  tongSoSach){
        this.banDoc= banDoc;
        this.detail= detail;
        this.tongSoSach =tongSoSach;
    }
    public int getTotalQuantity() {
        int total = 0;
        for (BookBorrowOrderDetail detail : detail) {
            total += detail.getSoLuong();
        }
        return total;
    }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public BookBorrowOrderDetail[] getDetail() {
        return detail;
    }

    public void setDetail(BookBorrowOrderDetail[] detail) {
        this.detail = detail;
    }

    public int getTongSoSach() {
        return tongSoSach;
    }

    public void setTongSoSach(int tongSoSach) {
        this.tongSoSach = tongSoSach;
    }

    @Override
    public String toString() {
        return "BorrowBookOrder{" +
                "banDoc=" + banDoc +
                ", detail=" + Arrays.toString(detail) +
                ", tongSoSach=" + tongSoSach +
                '}';
    }
}

