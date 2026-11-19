//10 november 2026, friday
import java.sql.Connection;
import java.util.Scanner;

import com.dao.GenericDao;
import com.mysql.cj.jdbc.MysqlDataSource;

public class GenericDaoTest {
    public static void main(String[] args) throws Exception {

        String user = "root";
        String password = "jas798";
        String dbname = "java";
        String url = "jdbc:mysql://localhost:3306/" + dbname;

        Connection connection = null;

        try {
            // Create DataSource
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser(user);
            ds.setPassword(password);
            ds.setURL(url);

            // Establish connection
            connection = ds.getConnection();

            // Create GenericDao object
            GenericDao dao = new GenericDao(connection);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter table name: ");
            String tableName = sc.next();

            // Display table
            dao.showTable(tableName);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}