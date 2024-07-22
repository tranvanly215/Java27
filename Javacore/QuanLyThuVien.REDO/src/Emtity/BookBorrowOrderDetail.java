package Emtity;


///Ham bookborrowOrder nay cos chuc nang taoj thoong tin
// muon sach cho 1 ban doc bao gom thong
// tin sach vaf so luong sach muon
public class BookBorrowOrderDetail {
    private Sach sach;
    private int soLuong;

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BookBorrowOrderDetail(Sach sach, int soLuong){
         this.sach=sach;
         this.soLuong= soLuong;

     }

    @Override
    public String toString() {
        return "BookBorrowOrderDetail{" +
                "sach=" + sach +
                ", soLuong=" + soLuong +
                '}';
    }
}
