// import java.sql.Connection;
// import java.sql.ResultSet;
// import java.sql.Statement;

// import com.mysql.cj.jdbc.MysqlDataSource;

// public class App {
//     public static void main(String[] args) throws Exception {
//         MysqlDataSource ds = new MysqlDataSource();
//         ds.setUser("root");
//         ds.setPassword("jas798");
//         ds.setURL("jdbc:mysql://localhost:3306/java"); 
//         Connection connection = null;
//         try {
//             connection = ds.getConnection();
//             Statement statement = connection.createStatement();
//             ResultSet resultset = statement.executeQuery("select * from datainfo");
//             while(resultset.next()){
//                 // data by column number
//                 int rollno = resultset.getInt(1);
//                 // data by column name
//                 // int empid2 = resultset.getInt("empid");
//                 String name = resultset.getString(2);
//                 // String email2 = resultset.getString("email");
//                 String branch = resultset.getString(3);
//                 String sem = resultset.getString(4);
//                 String marks = resultset.getString(5);

//                 System.out.println(rollno + "\t" + name + "\t" + branch + "\t" + sem + "\t" + marks);
//             }
//             resultset.close();
//             statement.close(); 
//             System.out.println(connection);
//         } catch (Exception e) {
//             e.printStackTrace();
//         } finally {
//             connection.close();
//         }
//     }
// }


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlDataSource;

public class App {
    public static void main(String[] args) throws Exception {

        MysqlDataSource ds = new MysqlDataSource();

        ds.setUser("root");
        ds.setPassword("jas798");
        ds.setURL("jdbc:mysql://localhost:3306/java");

        Connection connection = null;

        try {
            connection = ds.getConnection();

            System.out.println("Connected to MySQL successfully!");

            Statement statement = connection.createStatement();
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter id to search");
            int id=sc.nextInt();

            // ResultSet resultset = statement.executeQuery("SELECT * FROM datainfo");
            ResultSet resultset = statement.executeQuery("SELECT * FROM datainfo WHERE empid = " + id);

            while (resultset.next()) {

                // Fetch data by column number
                int empid = resultset.getInt(1);
                String fname = resultset.getString(2);
                String lname = resultset.getString(3);
                String email = resultset.getString(4);

                System.out.println(empid + "\t" + fname + "\t" + lname + "\t" + email);
            }

            resultset.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}