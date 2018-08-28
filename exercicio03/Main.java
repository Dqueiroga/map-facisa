package exercicio03;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao = Conexao.Conectar();
		try {
			String query = "select * from users";
			Statement statement = conexao.createStatement();
			ResultSet result = statement.executeQuery(query);
			
		}catch(Exception e) {
			System.out.println("erro ");
		}

	}

	}


