// class28_08
abstract class College{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Student();
    abstract void Staff();
    void medicalFacility(){
        System.out.println("Medical Facilities are optional");
    }
}
    class KIET extends College{
        void Register(){
            System.out.println("Kiet is registered with AKTU");
        };
        void Infrastructure(){
            System.out.println("Has a very very very good infra :)");
        }
        void Student(){
            System.out.println("These are our students");
        }
        void Staff(){
            System.out.println("Theek h, aab kuch bol nahi skte");
        }
        void medicalFacility(){
            System.out.println("No medical facility");
        }
    }

public class AbstractExample{
    public static void main(String[] args) {
        College c1;
        c1 = new KIET();
        c1.Register();
        c1.Infrastructure();
        c1.Staff();
        c1.Student();
        c1.medicalFacility();
    }
} 