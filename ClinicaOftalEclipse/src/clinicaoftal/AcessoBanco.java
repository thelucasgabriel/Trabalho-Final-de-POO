package clinicaoftal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AcessoBanco {
	public static void main(String a[]) {
		String url = "jdbc:postgresql://localhost:5432/BasePOO";
		String user = "postgres";
		String password = "12345678";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver OK");
		}catch (Exception e) {
			System.out.println("Erro Driver");
			return;
}
		try {
			conn = DriverManager.getConnection(url,user,password);
			stmt = conn.createStatement();
			String query = "select * from primeiratabela";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("id") + " - " +
						rs.getString("nome"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
			} catch (SQLException ex) {
				System.err.println(ex.getMessage());
			}
		}
	}
}