package sepah.bank;

public class Check {
    private int CheckID;
    private Account Account;
    public Check(Account Account){
        this.Account = Account;
    }
    public void setCheckID(int NewID){
        CheckID = NewID;
    }
    public int getCheckID(){
        return CheckID;
    }
    public Account getAccount(){
        return Account;
    }
}
