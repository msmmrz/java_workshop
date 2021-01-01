package Model.Repository;

import Model.Entity.Enti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repo implements AutoCloseable{

    @Override
    public void close() throws Exception {
    }
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repo () throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "masoume", "myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(Enti enti) throws Exception {
        preparedStatement = connection.prepareStatement(
                "insert into archive (id, model, plaque,violation ) values (?,?,?,?)");
        preparedStatement.setInt(1, enti.getId());
        preparedStatement.setString(2, enti.getModel());
        preparedStatement.setString(3, enti.getPlaque());
        preparedStatement.setString(4, enti.getViolation());
        preparedStatement.executeUpdate();
    }
    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }
}
