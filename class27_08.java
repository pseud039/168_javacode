// POLYMORPHISM
class EmployeePoly{
    String Emp_name;

    void detail(){
        System.out.println("Name: " + Emp_name);
    }
    void detail(int salary, String Organisation){
        System.out.println("Salary: "+salary);
    }
    void detail(String Organisation, int salary){
        System.out.println("Organisation name: " + Organisation);
    }
}

// public class class27_08{
//     public static void main(String[] args) {
//         EmployeePoly ep = new EmployeePoly();
//         ep.Emp_name = "Pseudo";
//         ep.detail();
//         ep.detail(12323);
//         ep.detail("KIET");

//     }

// }
//CHILD CLASS(RUNTIME POLYMORPSHIM)
class Faculty extends EmployeePoly{
    void detail(){
        super.detail(); //
        System.out.println("Hiii faculties!");
    }
}

public class class27_08{
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.Emp_name = "Pseudo";
        f1.detail();
    }
}