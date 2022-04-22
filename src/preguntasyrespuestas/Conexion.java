
package preguntasyrespuestas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433;"
                +"database=Preguntas;"
                +"use=sa;"
                +"password=12345"
                ;
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
            
        }catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
}
