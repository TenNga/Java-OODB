import java.util.*;
import javax.jdo.*;
import com.objectdb.Utilities;

public abstract class CreateData {
    public static void main(String argv[]) {

        TimeDate td1 = new TimeDate(15, 9, 01, 03, 2018);
        TimeDate td2 = new TimeDate(30, 10, 15, 03, 2018);
        TimeDate td3 = new TimeDate(45, 15, 01, 04, 2018);
        TimeDate td4 = new TimeDate(59, 23, 01, 10, 2020);
        CashDeposit cd1 = new CashDeposit("CD898760abc65", 1000, 4000);
        CashWithdrawal cw1 = new CashWithdrawal("CW10000xyz897", 2000, 2000);
        ATM atm1 = new ATM("20001111");
        Branch b1 = new Branch("20022", "Hillside", "200 Hillside St, Flushing, NY");
        Transfer t1 = new Transfer("T54378765sss765", 1000, 1000, 7000);
        Account a1 = new Account("87654008", 1000);
        Account a2 = new Account("14358055", 7000);
        AccountHolder ah1 = new AccountHolder("Jane Smith", "100 Main St., Flushing, NY", "123456789");
        BankCard bc1 = new BankCard("8765098724357651", "745", "60094");

        PersistenceManager pm = Utilities.getPersistenceManager("bank.odb");

        pm.currentTransaction().begin();
        pm.makePersistent(td1);
        pm.makePersistent(td2);
        pm.makePersistent(td3);
        pm.makePersistent(td4);
        pm.makePersistent(cd1);
        pm.makePersistent(cw1);
        pm.makePersistent(atm1);
        pm.makePersistent(b1);
        pm.makePersistent(t1);
        pm.makePersistent(a1);
        pm.makePersistent(a2);
        pm.makePersistent(ah1);
        pm.makePersistent(bc1);
        pm.currentTransaction().commit();

    }
}
