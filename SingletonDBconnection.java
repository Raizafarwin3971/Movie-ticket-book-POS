package ScopeCinema;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SingletonDBconnection {
    private SingletonDBconnection(){};
    private static SingletonDBconnection dbcon=new SingletonDBconnection();
    public static SingletonDBconnection getDBconnect(){ 
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbcon = (SingletonDBconnection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbookingsystem","root","fa1rw2in3!@#");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SingletonDBconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SingletonDBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbcon;
    }
    public void create_connection(){
        System.out.println("database connected successfully!");
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
