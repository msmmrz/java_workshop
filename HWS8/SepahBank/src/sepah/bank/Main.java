package sepah.bank;

public class Main {

    public static void main(String[] args) {
        // Service Factory Object
        BankServiceFactory bsf = new BankServiceFactory();

        Account ac1 = new Account("Masoume", 0, AccountType.LONG_TERM);
        Account ac2 = new Account("Fatemeh", 10, AccountType.SHORT_TERM);

        // Service Request 1
        NewAccountService sreq1 = bsf.requestService(ac1);
        sreq1.DoService();
        sreq1.ReportToCustomer();

        // Service Request 2
        NewAccountService sreq2 = bsf.requestService(ac2);
        sreq2.DoService();
        sreq2.ReportToCustomer();

        // Service Request 3: Loan For Account One
        RequestLoanService sreq3 = bsf.requestService(new Loan(100, ac1));
        sreq3.DoService();
        sreq3.ReportToCustomer();

        // Service Request 4: Credit Card For Account One
        NewCardService sreq4 = bsf.requestService(new CreditCard(ac1));
        sreq4.DoService();
        sreq4.ReportToCustomer();

        // Service Request 5: Loan For Account Two
        RequestLoanService sreq5 = bsf.requestService(new Loan(50, ac2));
        sreq5.DoService();
        sreq5.ReportToCustomer();

        // Service Request 6: Credit Card For Account Two
        NewCardService sreq6 = bsf.requestService(new CreditCard(ac2));
        sreq6.DoService();
        sreq6.ReportToCustomer();

        // Service Request 7: New Check For Account Two
        NewCheckService sreq7 = bsf.requestService(new Check(ac2));
        sreq7.DoService();
        sreq7.ReportToCustomer();
    }
}
