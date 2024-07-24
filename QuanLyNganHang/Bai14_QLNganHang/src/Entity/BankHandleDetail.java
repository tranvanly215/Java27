package Entity;

public class BankHandleDetail {
    private Banks bank;
    private int amounts;

    public BankHandleDetail(Banks bank, int amounts) {
        this.amounts = amounts;
        this.bank = bank;
    }


    public Banks getBank() {
        return bank;
    }

    public void setBank(Banks bank) {
        this.bank = bank;
    }

    public int getAmounts() {
        return amounts;
    }

    public void setAmounts(int amounts) {
        this.amounts = amounts;
    }

    @Override
    public String toString() {
        return "BankHandleDetail{" +
                "bank=" + bank +
                ", amounts=" + amounts +
                '}';
    }
}
