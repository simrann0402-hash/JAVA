class Employee{
    int empid;
    String name;
    static int nextEmpid=101;
    public Employee(String name){
        this.name=name;
        empid=nextEmpid;
        nextEmpid++;
    }
    public void show(){
        System.out.println("Employee " + empid+ " : "+ name);
    }

}
public class StaticIdGenerator {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Employee e1= new Employee("Simran");
        Employee e2= new Employee("Harman");
        Employee e3= new Employee("Drishti");
        e1.show();
        e2.show();
        e3.show();

    }
    
}
