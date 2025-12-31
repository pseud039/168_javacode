import java.util.HashSet;

public class HashSetExample{
    public static void main(String[] args) {
        
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(11);

        System.out.println("HashSet 2: "+numbers);

        HashSet<Integer> number1=new HashSet<>();
        number1.add(21);
        number1.add(12);

    }
}