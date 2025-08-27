// public class class22_08{
//     int Emp_id; 
//     static String Emp_name;

//     static {
//         // System.out.println("hi");
//         // This shows sabse pehle static run hoga, kyuki vo class variable ke time pr call hote h
//         Emp_name="Hola";
//     }
// // memory management me use hoga, object independent, used through class name, no requireement to recall it 
// void details(){
//     System.out.println("ID: "+ Emp_id+ " Name: "+ Emp_name);

// }
// static void StaticMethod(){
//     System.out.println("NAME: "+ Emp_name);
//     // Static Method ke andar non static members ko call nahi kr skte, otherwise there will be a compilation error
// }
// public static void main(String[] args) {
//     class22_08 e1 = new class22_08();
//     e1.Emp_id = 123213;
//     // e1.Emp_name= "sdjowid";
//     e1.details();
//     e1.StaticMethod();

//     class22_08 e2 = new class22_08();
//     e2.Emp_id=2342;
//     // e2.Emp_name="fdsfa";
//     e2.details();
// }
// }
 // THIS IS TO KNOW ABOUT FINAL KEYWORD
// public class class22_08{
//     int Emp_id;
//     final String Org = "KIET";

//     void finall(){
//         System.out.println("Id: "+Emp_id+ " Org: " + Org);
//     }
//     public static void main(String[] args) {
//         class22_08 e1 = new class22_08();
//         e1.Emp_id=232;
//         e1.finall();
//     }
// }

class Employee{
    int Emp_id;
    String Org="KIET";
    String Emp_name;

}

class Faculty extends Employee{
    String subject;
    void hola(){
        System.out.println("Hola");
        System.out.println("Id: "+Emp_id+ " Org: " + Org);
    }
}
public class class22_08{
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.Emp_id=23332;
        f1.Emp_name="fsf";
        f1.subject ="chutiyap";
        f1.hola();
    }

}
