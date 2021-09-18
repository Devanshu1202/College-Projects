import java.sql.Connection;
import java.sql.DriverManager;
public class JavaConnect {
    public static Connection getConnection()
            {
                Connection com=null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    com=DriverManager.getConnection("jdbc:mysql://localhost/HostelDb","root","");
                }
                catch(Exception e){
                    System.out.println(e);
            }
                return com;
            }
    
    
}