package sepah.bank;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class Db {
    private static Db instance = null;
    private Connection con;
    private Statement stmt;
    private Db(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sepah","root","");
            // Check Tables and Create them if needed
            DatabaseMetaData dbm = con.getMetaData();
            // 'accounts' Table
            ResultSet tables = dbm.getTables(null, null, "accounts", null);
            if (!tables.next()){
                stmt = con.createStatement();
                String sql = "CREATE TABLE `accounts` (\n" +
                        " `AccountID` int(11) NOT NULL AUTO_INCREMENT,\n" +
                        " `FullName` varchar(50) NOT NULL,\n" +
                        " `Type` varchar(20) NOT NULL,\n" +
                        " `Balance` int(11) NOT NULL,\n" +
                        " PRIMARY KEY (`AccountID`)\n" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
                stmt.executeUpdate(sql);
            }
            // 'loans' Table
            tables = dbm.getTables(null, null, "loans", null);
            if (!tables.next()){
                stmt = con.createStatement();
                String sql = "CREATE TABLE `loans` (\n" +
                        " `LoanID` int(11) NOT NULL AUTO_INCREMENT,\n" +
                        " `AccountID` int(11) NOT NULL,\n" +
                        " `Amount` int(11) NOT NULL,\n" +
                        " `IsCleared` tinyint(1) NOT NULL,\n" +
                        " PRIMARY KEY (`LoanID`),\n" +
                        " KEY `AccountID` (`AccountID`),\n" +
                        " CONSTRAINT `loans_ibfk_1` FOREIGN KEY (`AccountID`) REFERENCES `accounts` (`AccountID`) ON DELETE CASCADE ON UPDATE CASCADE\n" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
                stmt.executeUpdate(sql);
            }
            // 'checks' Table
            tables = dbm.getTables(null, null, "checks", null);
            if (!tables.next()){
                stmt = con.createStatement();
                String sql = "CREATE TABLE `checks` (\n" +
                        " `CheckID` int(11) NOT NULL AUTO_INCREMENT,\n" +
                        " `AccountID` int(11) NOT NULL,\n" +
                        " PRIMARY KEY (`CheckID`),\n" +
                        " KEY `AccountID` (`AccountID`),\n" +
                        " CONSTRAINT `checks_ibfk_1` FOREIGN KEY (`AccountID`) REFERENCES `accounts` (`AccountID`) ON DELETE CASCADE ON UPDATE CASCADE\n" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8\n";
                stmt.executeUpdate(sql);
            }
            // 'cards' Table
            tables = dbm.getTables(null, null, "cards", null);
            if (!tables.next()){
                stmt = con.createStatement();
                String sql = "CREATE TABLE `cards` (\n" +
                        " `CreditCardID` int(11) NOT NULL AUTO_INCREMENT,\n" +
                        " `AccountID` int(11) NOT NULL,\n" +
                        " `Code` varchar(16) NOT NULL,\n" +
                        " PRIMARY KEY (`CreditCardID`),\n" +
                        " KEY `AccountID` (`AccountID`),\n" +
                        " CONSTRAINT `cards_ibfk_1` FOREIGN KEY (`AccountID`) REFERENCES `accounts` (`AccountID`) ON DELETE CASCADE ON UPDATE CASCADE\n" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
                stmt.executeUpdate(sql);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static Db getInstance(){
        if (instance == null)
            instance = new Db();
        return instance;
    }
    public Account insertAccount(Account NewAccount){
        try{
            String sql = "INSERT INTO accounts (FullName, Balance, Type) VALUE (?, ?, ?)";
            PreparedStatement preparedStmt =  con.prepareStatement(sql);
            preparedStmt.setString(1, NewAccount.getFullName());
            preparedStmt.setInt(2, NewAccount.getBalance());
            preparedStmt.setString(3, NewAccount.getType().name());
            int affectedRows = preparedStmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            ResultSet rs = preparedStmt.getGeneratedKeys();
            rs.next();
            NewAccount.setAccountID(rs.getInt(1));
            return NewAccount;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public Loan insertLoan(Loan NewLoan){
        try{
            String sql = "INSERT INTO loans (AccountID, Amount, IsCleared) VALUE (?, ?, ?)";
            PreparedStatement preparedStmt =  con.prepareStatement(sql);
            preparedStmt.setInt(1, NewLoan.getAccount().getAccountID());
            preparedStmt.setInt(2, NewLoan.getAmount());
            preparedStmt.setBoolean(3, NewLoan.isCleared());
            int affectedRows = preparedStmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            ResultSet rs = preparedStmt.getGeneratedKeys();
            rs.next();
            NewLoan.setLoanID(rs.getInt(1));
            return NewLoan;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public Check insertCheck(Check NewCheck){
        try{
            String sql = "INSERT INTO checks (AccountID) VALUE (?)";
            PreparedStatement preparedStmt =  con.prepareStatement(sql);
            preparedStmt.setInt(1, NewCheck.getAccount().getAccountID());
            int affectedRows = preparedStmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            ResultSet rs = preparedStmt.getGeneratedKeys();
            rs.next();
            NewCheck.setCheckID(rs.getInt(1));
            return NewCheck;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public CreditCard insertCreditCard(CreditCard NewCard){
        try{
            String sql = "INSERT INTO cards (AccountID, Code) VALUE (?, ?)";
            PreparedStatement preparedStmt =  con.prepareStatement(sql);
            preparedStmt.setInt(1, NewCard.getAccount().getAccountID());
            preparedStmt.setString(2, NewCard.getCode());
            int affectedRows = preparedStmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            ResultSet rs = preparedStmt.getGeneratedKeys();
            rs.next();
            NewCard.setCreditCardID(rs.getInt(1));
            return NewCard;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
