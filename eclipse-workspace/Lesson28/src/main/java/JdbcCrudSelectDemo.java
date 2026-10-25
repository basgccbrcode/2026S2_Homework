import java.sql.*;

/* About Prepared Statements
 * 
 * We should first remember the Python unit when we did the same thing.
 * 
 * # Python sqlite3
 * 
 * cursor.execute(
 *   "SELECT id FROM comics WHERE = ?",
 *   ("Spiderman",)
 * )
 * 
 * // JDBC
 *
 * PreparedStatement ps = connection.prepareStatement(
 *   "SELECT id FROM comics WHERE title = ?"
 * )
 * ps.SetString(1, "Spiderman");
 * ResultSet rows = ps.executeQuery();
 *
 */

public class JdbcCrudSelectDemo {
	public static void main(String[] args) {
		String url = "jdbc:sqlite:comics.db";
		try (Connection conn = DriverManager.getConnection(url)) {
			
			System.out.println("-- SELECT (first 5");
			try(Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(
							"SELECT id, title, author, price " +
					        "FROM comics ORDER BY id LIMIT 5")) {
				while (rs.next()) {
					printRow(rs);
				}
			}
			
			// Rewrite this code to use PreparedStatements
			System.out.println("-- Show more expensive than ten dollars");
			try(Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(
							"SELECT id, title, author, price " +
					        "FROM comics WHERE price > 10 ORDER BY price, id")) {
				while (rs.next()) {
					printRow(rs);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void printRow(ResultSet rs) throws SQLException {
		System.out.printf("%2d | %-28s | %-22s | $%.2f\n, ",
				rs.getInt("id"),
				rs.getString("title"),
				rs.getString("author"),
				rs.getDouble("price"));
	}

}
