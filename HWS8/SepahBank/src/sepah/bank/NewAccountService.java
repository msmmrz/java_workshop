package sepah.bank;

public class NewAccountService implements BankService{
    private Account NewAccount;
    private boolean isCreated = false;
    public NewAccountService(Account NewAccount){
        this.NewAccount = NewAccount;
    }

    @Override
    public void DoService() {
        if (NewAccount.getBalance() >= 0){
            if (SaveToDatabase())
                isCreated = true;
        }
    }

    @Override
    public boolean SaveToDatabase() {
        NewAccount = Db.getInstance().insertAccount(NewAccount);
        return NewAccount != null;
    }

    @Override
    public void ReportToCustomer() {
        if (isCreated){
            System.out.println("New Account Created For: "+NewAccount.getFullName()+", ID: "+NewAccount.getAccountID()+", Type: "+NewAccount.getType().name()+", Balance: "+NewAccount.getBalance());
        }
        else{
            System.out.println("New Account Creation For: "+NewAccount.getFullName()+", Request was not Approved!");
        }
    }
}
