@javax.jdo.annotations.PersistenceCapable

public class Transfer extends ATMTransaction {
    float targetBalance;

    public Transfer(String IDcode, float amount, float balance, float targetBalance){
        this.IDcode = IDcode;
        this.amount = amount;
        this.balance = balance;
        this.targetBalance = targetBalance;
    }
}
