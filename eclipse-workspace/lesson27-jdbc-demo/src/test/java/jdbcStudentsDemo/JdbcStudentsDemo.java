package jdbcStudentsDemo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** Creates a small SQLite table, adds one student, and reads the row through JDBC. */
public class JdbcStudentsDemo {
    private static final String DATABASE_URL = "jdbc:sqlite:target/students.db";

    public static void main(String[] args) {
        try {
            Files.createDirectories(Path.of("target"));
            try (Connection connection = DriverManager.getConnection(DATABASE_URL);
                    Statement statement = connection.createStatement()) {
                System.out.println("Connected to SQLite.");

                statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS students ("
                        + "id INTEGER PRIMARY KEY, name TEXT NOT NULL, grade INTEGER NOT NULL)"
                );
                statement.executeUpdate(
                    "INSERT OR IGNORE INTO students (id, name, grade) VALUES (1, 'Ava', 82)"
                );

                try (ResultSet rows = statement.executeQuery(
                        "SELECT name, grade FROM students ORDER BY id")) {
                    while (rows.next()) {
                        System.out.println(rows.getString("name") + ": " + rows.getInt("grade"));
                    }
                }
            }
        } catch (IOException | SQLException exception) {
            System.err.println("Database error: " + exception.getMessage());
            System.exit(1);
        }
    }
}
