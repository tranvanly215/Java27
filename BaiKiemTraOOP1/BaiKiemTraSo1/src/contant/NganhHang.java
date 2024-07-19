package contant;

public enum NganhHang {
    DT("Dien tu"),
    DL("Dien lanh"),
    MT("May tinh"),
    TBVP("Thiet bi van phong");
    public String value;
    public String getValue() {
        return value;
    }
    NganhHang(String value){
        this.value = value;
    }

}
