package Constan;

public enum ChuyenNganh {
    KHTN("Khoa hoc tu nhien"),
    VHNT("Van Hoc Nghe Thuat"),
    DTVT("Dien Tu Vien Thong"),
    CNTT("Cong nghe Thong tin");
 public  String value;

    public String getValue() {
        return value;
    }
    ChuyenNganh(String value){
        this.value= value;
    }
}
