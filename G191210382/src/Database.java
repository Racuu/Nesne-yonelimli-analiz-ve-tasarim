import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	public static Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5461/kullanicibilgileri", "postgres", "141298");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}

	public boolean control(String username,String password) {
		Connection conn = connect();
		String sql = "SELECT *  FROM \"kullanici\" WHERE \"kullaniciadi\"='" + username + "' and \"sifre\"='"
				+ password + "'";
		if (conn != null) {
			try {
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				conn.close();
				if (rs.next())
					return true;
				else
					return false;

			} catch (Exception e) {
				// TODO: handle exception
			}
		} else
			return false;
		return false;

	}

}
