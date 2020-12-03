package sepah.bank;

public class NewCheckService implements BankService{
    private Check NewCheck;
    private boolean isApproved = false;

    public NewCheckService(Check NewCheck){
        this.NewCheck = NewCheck;
    }
    @Override
    public void DoService() {
        // Check For Account, Barressi sehat account
        if (NewCheck.getAccount().getAccountID() > 0){
            if (SaveToDatabase())
                isApproved = true;
        }
    }

    @Override
    public boolean SaveToDatabase() {
        NewCheck = Db.getInstance().insertCheck(NewCheck);
        return NewCheck != null;
    }

    @Override
    public void ReportToCustomer() {
        if (isApproved){
            System.out.println("Check Is Created For AccountID: "+NewCheck.getAccount().getAccountID()+", CheckID: "+NewCheck.getCheckID());
        }
        else {
            System.out.println("Check Request Was Not Approved!");
        }
    }
}
