@javax.jdo.annotations.PersistenceCapable

public class CashWithdrawal extends ATMTransaction {

    public CashWithdrawal(String IDcode, float amount, float balance){
        this.IDcode = IDcode;
        this.amount = amount;
        this.balance = balance;
    }
}
