package sepah.bank;

public class Loan {
    private int LoanID;
    private int Amount;
    private Account Account;
    private boolean IsCleared = false;

    public Loan(int Amount, Account Account){
        this.Amount = Amount;
        this.Account = Account;
    }
    public void setLoanID(int NewID){
        LoanID = NewID;
    }
    public int getLoanID(){
        return LoanID;
    }
    public int getAmount(){
        return Amount;
    }
    public Account getAccount(){
        return Account;
    }
    public boolean isCleared(){
        return IsCleared;
    }
    public void clearLoan(){
        IsCleared = true;
    }
}
