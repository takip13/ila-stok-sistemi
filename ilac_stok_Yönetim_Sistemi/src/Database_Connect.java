import java.sql.*; 
import oracle.jdbc.driver.OracleDriver;


public class Database_Connect
{
 
    
    public static void main(String[] args) {
        new Database_Connect();
    }
     
 
    public static final String userName = "system";
    public static final String password = "asena123";
    
    public static Statement statement = null;
    public static Connection con = null;
    private static PreparedStatement preparedStatement = null;
    Connection conn;

    public Database_Connect() 
    {
       //String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber +  ":" + sid;
       String url="jdbc:oracle:thin:@localhost:1521:xe";
       
        try 
        {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Driver Bulunamadı.");
            
        }

        try 
        {
             con = DriverManager.getConnection(url, userName, password);
             System.out.println("Bağlantı Başarılı...");
        } 
        
        catch (SQLException ex) 
        {
            System.out.println("Bağlantı Başarısız...");
            ex.printStackTrace();
        }
    
    
    }

    void baglan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}    