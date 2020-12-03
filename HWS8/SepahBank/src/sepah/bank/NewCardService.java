package sepah.bank;

public class NewCardService implements BankService{
    private CreditCard NewCard;
    private boolean isApproved = false;

    public NewCardService(CreditCard NewCard){
        this.NewCard = NewCard;
    }
    @Override
    public void DoService() {
        // Check For Account, Barressi sehat account
        if (NewCard.getAccount().getAccountID() > 0){
            if (SaveToDatabase())
                isApproved = true;
        }
    }

    @Override
    public boolean SaveToDatabase() {
        NewCard = Db.getInstance().insertCreditCard(NewCard);
        return NewCard != null;
    }

    @Override
    public void ReportToCustomer() {
        if (isApproved){
            System.out.println("Card Is Created For AccountID: "+NewCard.getAccount().getAccountID()+", Card Code: "+NewCard.getCode());
        }
        else {
            System.out.println("Card Request Was Not Approved!");
        }
    }
}
