//17 november 2026, tuesday
package com.model;

public class Employee {
    private int empid;
    private String email;
    private String firstname;
    private String lastname;
    //2 constructors
    public Employee(){}
    public Employee(int empid, String firstname, String lastname, String email)
    {
        this.empid=empid;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    }
    public int getEmpid() 
    {
        return empid;
    }
    public void setEmpid(int empid)
    {
        this.empid=empid;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname=firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname=lastname;
    }


    public String toString()
    {
        return "Employee [empid=" + empid + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
                + "]";
    }
}
