package Java;

public class CuentaBancaria {

    private Integer accountNumber;
    protected Boolean activated;

    public CuentaBancaria(Integer accountNumber, Boolean activated ){
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
        return "CuentaBancaria{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
}

