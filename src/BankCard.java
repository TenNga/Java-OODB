import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable
public class BankCard {
    TreeSet<ATMTransaction> cardUsed = new TreeSet<ATMTransaction>();
    AccountHolder cards;
    String number;
    String securityCode;
    String PIN;

    public BankCard(String number, String securityCode, String PIN){
        this.number = number;
        this.securityCode = securityCode;
        this.PIN = PIN;
    }
}
