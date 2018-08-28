package exercicio03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/** 
 * Atividade: Aplique o padrão Singleton na classe abaixo. 
 *
 **/
public final class Conexao {
 
    private Conexao () { }
    public static Connection con;
    private static Conexao instance;

    public static synchronized Connection Conectar() {
    	System.out.println("Conectando ao banco");
    		try {
    			if(con == null) {
    				 Class.forName("com.mysql.jdbc.Driver");
    			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","usuario","senha");
    		}
    		}catch(SQLException e) {
    			System.out.println(e);
    			throw new RuntimeException(e);
    			
    		}
    		catch (ClassNotFoundException  c) {
				System.out.println("ClassNotFoundException exception " + c.getMessage());
    }
    	return con;
    }
    	
}    	
    	