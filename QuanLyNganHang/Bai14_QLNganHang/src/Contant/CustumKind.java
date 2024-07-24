package Contant;

public enum CustumKind {
    CN("Cá nhân"),

    TT("Tập thể"),

    DN("Doanh Nghiệp");

    public String value;

    public String getValue() {
        return value;
    }

    CustumKind(String value) {
        this.value = value;
    }
}
