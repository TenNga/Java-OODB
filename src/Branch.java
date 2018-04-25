import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable
public class Branch {
    TreeSet<ATM> ATMs = new TreeSet<ATM>();
    String IDcode;
    String name;
    String address;

    public Branch(String IDcode, String name, String address){
        this.IDcode = IDcode;
        this.name = name;
        this.address = address;
    }
}
