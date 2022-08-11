package cf.indexfoundation.www;

class Employee{
    int empId, empSalary;
    String empName;
    
    public Employee(int id, int salary, String name){      //Creating a new constructor with the name Employee
        this.empId = id;
        this.empSalary = salary;
        this.empName = name;
    }

    public void setEmpSalary(int newSalary) {
        this.empSalary = newSalary;
    }
}

public class constructor {
    public static void main(String[] args) {
        Employee employee1 = new Employee(450089, 65015,"Subhajit Majhi");     //Creating an object for the constructor Employee

        //Display the result
        System.out.println("Employee's Name: " +employee1.empName+ " Employee's ID: " +employee1.empId+ " Employee's Salary: " +employee1.empSalary);
        System.out.println("---------------------------------------------");

        //Setting the new salary
        employee1.setEmpSalary(85105);

        //Display the result again
        System.out.println("Employee's Name: " +employee1.empName+ " Employee's ID: " +employee1.empId+ " Employee's Salary: " +employee1.empSalary);
    }
}
