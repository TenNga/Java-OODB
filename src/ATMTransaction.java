@javax.jdo.annotations.PersistenceCapable

public abstract class ATMTransaction {
    BankCard card; //Inverse of ATMTransaction -> BankCard *,1
    Account account; //Inverse of Transfer ---> Account *,1
    ATM atm; //Inverse of ATMTransaction ---> ATM *,1
    TimeDate timeDate;
    String IDcode;
    float amount;
    float balance;
}
