public class Employee{
    //Constructor
    //<identification>
    //1.1 same name as class mname
    //1.2 No return type
    //<purpose>
    //1.1 it creates/intializes Oject in Memory(RAM)
    //1.2 you can use constructor Block too intialize some dafault values
    int employeeID;
    int salary;
    String dept;
    Employee(int empid, int sal, String d){
        employeeID= empid;
        salary = sal;
        dept = d;
    }

    public static void main(String[] args){
        Employee harsha = new Employee(101, 3000, "Testing"); //calling the constructor basically vcreates the object physically so that we can use that
        Employee varsha = new Employee(102, 5000, "Engineering");
        System.out.println(harsha.employeeID+" Salary "+harsha.salary+" Dept "+harsha.dept);
        System.out.println(varsha.employeeID+" Salary "+varsha.salary+" Dept "+varsha.dept);
    }
}