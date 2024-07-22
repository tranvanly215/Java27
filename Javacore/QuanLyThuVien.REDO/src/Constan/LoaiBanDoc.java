package Constan;

public enum LoaiBanDoc {
    HS("Hoc Sinh"),
    HVCH("Hoc Vien Cao Hoc"),
    GV("Giao Vien");

    public String value;


    public String getValue() {
        return value;
    }

    LoaiBanDoc(String value) {
        this.value = value;
    }

}