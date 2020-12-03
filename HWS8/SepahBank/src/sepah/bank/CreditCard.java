package sepah.bank;
import java.util.Random;
public class CreditCard {
    private int CreditCardID;
    private Account Account;
    private String Code;

    public CreditCard(Account Account){
        this.Account = Account;
        Random rand = new Random();
        Code = "58921011" + rand.nextInt(9999) + rand.nextInt(9999);
    }
    public void setCreditCardID(int NewID){
        CreditCardID = NewID;
    }
    public int getCreditCardID(){
        return CreditCardID;
    }
    public Account getAccount(){
        return Account;
    }
    public String getCode(){
        return Code;
    }
}
