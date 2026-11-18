
//17 november 2026, tuesday

import java.sql.Connection;
import java.util.Scanner;

import com.dao.EmployeeDao;
import com.model.Employee;
import com.mysql.cj.jdbc.MysqlDataSource;

public class AppDao {
    public static void main(String[] args) throws Exception {

        String user = "root";
        String password = "jas798";
        String dbname = "java";
        String url = "jdbc:mysql://localhost:3306/" + dbname;

        Connection connection = null;

        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser(user);
            ds.setPassword(password);
            ds.setURL(url);

            connection = ds.getConnection();

            EmployeeDao employeeDao = new EmployeeDao(connection);

            Scanner sc = new Scanner(System.in);

            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Enter employee id: ");
                int empid = sc.nextInt();

                System.out.println("Enter employee first name: ");
                String fname = sc.next();

                System.out.println("Enter employee last name: ");
                String lname = sc.next();

                System.out.println("Enter employee email: ");
                String email = sc.next();

                Employee newEmp = new Employee(empid, fname, lname, email);

                Employee result = employeeDao.addEmployee(newEmp);

                if (result != null) {
                    System.out.println("Employee added successfully!");
                } else {
                    System.out.println("Employee not added!");
                }
            }

            else if (choice == 2) {

                System.out.println("Enter employee id to search: ");
                int empid = sc.nextInt();

                Employee employee = employeeDao.getEmployeeById(empid);

                if (employee != null) {
                    System.out.println("Employee found: " + employee);
                } else {
                    System.out.println("Employee not found.");
                }
            }

            else if (choice == 3) {

                System.out.println("Enter employee id to update: ");
                int empid = sc.nextInt();

                System.out.println("Enter new first name: ");
                String fname = sc.next();

                System.out.println("Enter new last name: ");
                String lname = sc.next();

                System.out.println("Enter new email: ");
                String email = sc.next();

                Employee emp = new Employee(empid, fname, lname, email);

                Employee result = employeeDao.updateEmployee(emp);

                if (result != null) {
                    System.out.println("Employee updated successfully!");
                } else {
                    System.out.println("Employee not found or not updated!");
                }
            }

            else if (choice == 4) {

                System.out.println("Enter employee id to delete: ");
                int empid = sc.nextInt();

                boolean result = employeeDao.deleteEmployee(empid);

                if (result) {
                    System.out.println("Employee deleted successfully!");
                } else {
                    System.out.println("Employee not found or not deleted!");
                }
            }

            else {
                System.out.println("Invalid choice!");
            }

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
