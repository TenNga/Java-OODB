import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable

public class AccountHolder {
    TreeSet<Account> account = new TreeSet<Account>(); // Inverse of AccountHolder --> Account
    TreeSet<BankCard> card = new TreeSet<BankCard>();//Inverse of AccountHolder ---> BankCard 1,1..*
    String name;
    String address;
    String SSN;

    public AccountHolder(String name, String address, String SSN){
        this.name = name;
        this.address = address;
        this.SSN = SSN;
    }

}
