
//17 november 2026, tuesday
package com.dao;

import java.sql.Connection;
import com.model.Employee;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

//this class will accept a connection
//this class will do CRUD operations on the employee table wrt Employee class

public class EmployeeDao {
    private Connection connection;

    public EmployeeDao(Connection connection)
    {
        this.connection = connection;
    }

    // READ - Get employee by ID
    public Employee getEmployeeById(int empid)
    {
        try {
            PreparedStatement statement = connection.prepareStatement(
                "select * from employee where empid=?"
            );

            statement.setInt(1, empid);

            ResultSet resultset = statement.executeQuery();

            if(resultset.next())
            {
                int empidDb = resultset.getInt("empid");
                String fname = resultset.getString("firstname");
                String lname = resultset.getString("lastname");
                String email = resultset.getString("email");

                Employee obj = new Employee(empidDb, fname, lname, email);

                statement.close();
                return obj;
            }
            else {
                statement.close();
                return null;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    // CREATE - Add employee
    public Employee addEmployee(Employee emp)
    {
        try {
            PreparedStatement statement = connection.prepareStatement(
                "insert into employee (empid, firstname, lastname, email) values (?, ?, ?, ?)"
            );

            statement.setInt(1, emp.getEmpid());
            statement.setString(2, emp.getFirstname());
            statement.setString(3, emp.getLastname());
            statement.setString(4, emp.getEmail());

            int rowsUpdated = statement.executeUpdate();

            statement.close();

            if(rowsUpdated == 1)
            {
                return emp;
            }
            else
            {
                return null;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // UPDATE - Update employee details
    public Employee updateEmployee(Employee emp)
    {
        try {
            PreparedStatement statement = connection.prepareStatement(
                "update employee set firstname=?, lastname=?, email=? where empid=?"
            );

            statement.setString(1, emp.getFirstname());
            statement.setString(2, emp.getLastname());
            statement.setString(3, emp.getEmail());
            statement.setInt(4, emp.getEmpid());

            int rowsUpdated = statement.executeUpdate();

            statement.close();

            if(rowsUpdated == 1)
            {
                return emp;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    // DELETE - Delete employee by ID
    public boolean deleteEmployee(int empid)
    {
        try {
            PreparedStatement statement = connection.prepareStatement(
                "delete from employee where empid=?"
            );

            statement.setInt(1, empid);

            int rowsDeleted = statement.executeUpdate();

            statement.close();

            if(rowsDeleted == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
