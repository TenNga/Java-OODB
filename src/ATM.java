import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable
public class ATM {
    TreeSet<ATMTransaction> ATMUsed = new TreeSet<ATMTransaction>();
    String IDcode;
    public ATM(String IDcode){
        this.IDcode = IDcode;
    }
}
