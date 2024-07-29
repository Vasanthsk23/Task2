package question4;

import java.util.Scanner;

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

    public static void main(String[] args) {
        Employee obj = new Employee();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        obj.setName(name);

        System.out.println("Enter your EmployeeID ");
        String employeeID = scanner.nextLine();
        obj.setEmployeeID(employeeID);

        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        obj.setAge(age);

        System.out.println("Enter your salary ");
        double salary = scanner.nextDouble();
        obj.setSalary(salary);

        System.out.println("<------------------Employee details saved-------------------->");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("EmployeeID: "+ obj.getEmployeeID());
        System.out.println("Salary: " + obj.getSalary());

    }

}
