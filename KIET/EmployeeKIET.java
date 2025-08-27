// package KIET;

// public class EmployeeKIET{
//     public String Emp_name;
//     private int Salary;
//     protected int Emp_id;
//     String organisation;

//     void Employeedetails(){
//         System.out.println("Details of KIET Employee are :" Emp_id + " " + Emp_name +" "+ Salary);
//     }
// }
package KIET;

public class EmployeeKIET{

    public String Emp_name;
    private int Salary;
    protected  int Emp_id;
    String organisation;

    void employeeDetails(){
        System.out.println("Details of Kiet Employee are:" +"\n" +Emp_id +" " +Emp_name +" " +Salary +" " +organisation);
    }
    public static void main(String[] args) {
        EmployeeKIET ek=new EmployeeKIET();
        ek.Emp_name="Divya";
        ek.Emp_id=1;
        ek.Salary=100000;
        ek.organisation="KIET CAMPUS";
        ek.employeeDetails();
        }
}