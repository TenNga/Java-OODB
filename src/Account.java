import java.util.HashSet;
import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable
public class Account {
    String number;
    float currentBalance;
    TreeSet<Transfer> tranf = new TreeSet<Transfer>(); //Inverse of Transer to Acc
    TreeSet<ATMTransaction> atmTransactions = new TreeSet<ATMTransaction>();
    HashSet<AccountHolder> accounts = new HashSet<AccountHolder>();

    public Account(String number, float currentBalance){
        this.number = number;
        this.currentBalance = currentBalance;
    }
}
