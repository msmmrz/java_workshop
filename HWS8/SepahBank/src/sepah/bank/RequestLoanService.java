package sepah.bank;

public class RequestLoanService implements BankService{
    private Loan NewLoan;
    private boolean isApproved = false;

    public RequestLoanService(Loan NewLoan){
        this.NewLoan = NewLoan;
    }

    @Override
    public void DoService() {
        // Check For Account, Barressi sehat account
        if (NewLoan.getAccount().getAccountID() > 0){
            if (SaveToDatabase())
                isApproved = true;
        }
    }

    @Override
    public boolean SaveToDatabase() {
        NewLoan = Db.getInstance().insertLoan(NewLoan);
        return NewLoan != null;
    }

    @Override
    public void ReportToCustomer() {
        if (isApproved){
            System.out.println("Loan Was Approved For AccountID: "+NewLoan.getAccount().getAccountID()+
                    "("+NewLoan.getAccount().getFullName()+")"+", Amount: "+NewLoan.getAmount()+
                    ", LoanID: "+NewLoan.getLoanID());
        }
        else {
            System.out.println("Loan Request Was Not Approved!");
        }
    }
}
