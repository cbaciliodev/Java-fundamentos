package pe.mil.ejercito.javabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class JavaConexionOracle {
    
    public static void main(String[] args) throws SQLException {
        /**
         * Procedimientos de conexión a nuestra BD
         */
        // 1. Cargar y registrar driver
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());

        // 2. Realizar la conexión
        Connection conn = DriverManager.getConnection
          ("jdbc:oracle:thin:@oracle.csfdvy0sgvqt.us-west-2.rds.amazonaws.com:1521:ORCL", 
                  "oracle", 
                  "oracle2018");
        
        // 3. Creamos el statement
        Statement stmt = conn.createStatement();
        
        // 4. Obtenemos el resultSet
        ResultSet rset = stmt.executeQuery("select BANNER from SYS.V_$VERSION");
        
        // 5. Iteramos y mostramos
        while (rset.next()){
            System.out.println (rset.getString(1));
        }
         
        // 6. Cerramos el statement, resultset y connection
        rset.close();
        stmt.close();
        conn.close();
        
        
    }
}
