// package UNIT2;
import java.util.*;

class StudentDemo {
    // Instance method (non-static)
    public void print(int n) {
        System.out.println("Student ID: " + n);
    }
    // public void new(int n){
    //     System.out.println("Hii"+n);
    // }
}

public class methodRefrence {
    public static void main(String[] args) {
        List<Integer> IDs = Arrays.asList(1, 2, 3, 4);

        StudentDemo sd = new StudentDemo();

        IDs.forEach(sd::print);
        IDs.forEach(StudentDemo::new);

    }
}
