package question4;

public class Employee extends Person {
    private String employeeID;
    private double salary;

    public String getEmployeeID(){
        return this.employeeID;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public Employee(){
        super();

    }
}
