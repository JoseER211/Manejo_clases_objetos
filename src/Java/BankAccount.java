package Java;

/**
 * Representa características de una cuenta de banco.
 * @author Jose David Echavarria Ruiz
 */

public class BankAccount {

    private Integer accountNumber;
    protected Boolean activated;

    /**
     * Crea una instancia de BankAccount
     * @param accountNumber propiedad de la clase
     * @param activated propiedad de la clase
     */

    public BankAccount(Integer accountNumber, Boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * getters y setters para acceder a las propiedades
     */

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

    /**
     * Muestra las propiedades de la clase BankAccount
     * @return Los valores de las propiedades
     */

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
}

