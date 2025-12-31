public class class20_8{
    int Emp_id;
    String Emp_name;

    public class20_8(int i, String name) {
        Emp_id=i;
        Emp_name=name;
    }
    public class20_8(class20_8 e2){
        Emp_id= e2.Emp_id;
        Emp_name = e2.Emp_name;
    }
    void printInfo(){
        System.out.println("Details of Employee are: "+Emp_id+" "+Emp_name);
    }
    public static void main(String[] args) {
        class20_8 e1 = new class20_8(43, "Pseudo");
        e1.printInfo();

        class20_8 copy1;
        copy1 = e1;
        copy1.Emp_id = 20;
        e1.printInfo();
        // System.out.println(e1.Emp_id);

        class20_8 e2 = new class20_8(e1.Emp_id, e1.Emp_name); 
        e2.printInfo();
        // ye kr skte h, yha hum manually data enter kr rhe, but to if jyada keys ho to uske liye create new constructor 

        class20_8 e3 = new class20_8(e1);
        e3.printInfo();
        e3.Emp_id = 423;
        System.out.println(e1.Emp_id);
    }
}
