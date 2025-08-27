public class Employee{
    String name;
    int salary;
    Employee(){
        name="hii";
        salary=7788;
        
    }
    Employee(int salary, String name){
        this.salary = salary;
        this.name = name;
        
    }
    public  void displayEmployee(){
        System.out.println("The good name is: " +name+ " and her salary:"+salary);
    }
    public static void main(String[] args){
        Employee m1 = new Employee();
        // m1.name = "Preeti";
        // m1.salary = 100000000;
        m1.displayEmployee();

        Employee m2 = new Employee();
        m2.name = "Hola";
        m2.salary = 34343;
        m2.displayEmployee();

        Employee m3  = new Employee(4576, "rewfdo");
        m3.displayEmployee();
}
    }
// This is a non parameterised method. Which means we have to create a method which donot have any parameters init, and we create it manually, java donot provide this methods.
