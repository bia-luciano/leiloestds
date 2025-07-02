
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class conectaDAO {
    
    public Connection connectDB(){
               
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/leilao?user=root&password=alessiA22!&useSSL=false&allowPublicKeyRetrieval=true");
            
        } catch (SQLException erro){
            throw new RuntimeException("Erro ConectaDAO" + erro.getMessage());
        }
          

    }
}
        