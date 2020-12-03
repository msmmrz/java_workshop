package sepah.bank;

public class BankServiceFactory {
    public NewAccountService requestService(Account NewAccount){
        return new NewAccountService(NewAccount);
    }
    public RequestLoanService requestService(Loan NewLoan){
        return new RequestLoanService(NewLoan);
    }
    public NewCheckService requestService(Check NewCheck){
        return new NewCheckService(NewCheck);
    }
    public NewCardService requestService(CreditCard NewCard){
        return new NewCardService(NewCard);
    }
}
