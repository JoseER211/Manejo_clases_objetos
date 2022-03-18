package Java;

public class BankAccount {

    private Integer accountNumber;
    protected Boolean activated;

    public BankAccount(Integer accountNumber, Boolean activated ){
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
}

