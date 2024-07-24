package Entity;

import java.util.Arrays;

public class BanksHanle {
    private Custumer custumer;
    private BankHandleDetail[] bankHandleDetails;

    public BanksHanle(Custumer custumer, BankHandleDetail[] bankHandleDetails) {
        this.custumer = custumer;
        this.bankHandleDetails = bankHandleDetails;
    }

    public Custumer getCustumer() {
        return custumer;
    }

    public void setCustumer(Custumer custumer) {
        this.custumer = custumer;
    }

    public BankHandleDetail[] getBankHandleDetails() {
        return bankHandleDetails;
    }

    public void setBankHandleDetails(BankHandleDetail[] bankHandleDetails) {
        this.bankHandleDetails = bankHandleDetails;
    }

    @Override
    public String toString() {
        return "BanksHanle{" +
                "custumer=" + custumer +
                ", bankHandleDetails=" + Arrays.toString(bankHandleDetails) +
                '}';
    }
}
