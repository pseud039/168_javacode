
import java.util.*;
import java.util.stream.Collectors;

public class StreamAllExample{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,34,24,324,232,2);
        System.out.println("Original" + numbers);
        List<Integer> evens = numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println("Even"+evens);
        
    }
};