@javax.jdo.annotations.PersistenceCapable
public abstract class ATMTransaction {
    TimeDate timeDate;
    String IDcode;
    float amount;
    float balance;
}
