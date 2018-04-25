@javax.jdo.annotations.PersistenceCapable

public class CashDeposit extends ATMTransaction{

    public CashDeposit(String IDcode, float amount, float balance){
        this.IDcode = IDcode;
        this.amount = amount;
        this.balance = balance;
    }
}
