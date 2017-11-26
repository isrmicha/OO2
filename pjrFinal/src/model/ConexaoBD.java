package model;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ConexaoBD {
	private Connection con;

	public Connection iniciaBd() {
		try {
			String database = "jdbc:mysql://127.0.0.1:3306/abandonoemprego";
			String usuario = "root";
			String senha = "";
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(database, usuario, senha);
			System.out.println("conectou BD");
			return con;
		} catch (Exception e) {
			System.out.println("ERRO conectou BD");
			return null;
			// e.printStackTrace();
		}
	}
	public void executaQuery(String[] str, Connection con) throws SQLException {
		PreparedStatement stmt = null;
		// cria um preparedStatement
		String sql = "insert into log"
				+ " (nomeEmpresa,cnpjEmpresa,enderecoEmpresa,nomeFuncionario,ctpsFuncionario,serieCtpsFuncionario,dataAbandono)"
				+ " values (?,?,?,?,?,?,?)";
		stmt = (PreparedStatement) con.prepareStatement(sql);
		for (int i = 0; i < str.length; i++) {
			stmt.setString(i + 1, str[i]);
		}
		stmt.execute();
		stmt.close();
		con.close();
	}
}
