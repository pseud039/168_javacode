import java.util.ArrayDeque;


public class ArrayDequeueExample{

    public static void main(String[] args) {
        
        ArrayDeque<String> dequeue=new ArrayDeque<>();

        dequeue.add("A");
        dequeue.addFirst("F");
        dequeue.addLast("L");

        dequeue.offer("C");
        dequeue.offerFirst("First");
        dequeue.offerLast("Last");
        System.out.println(dequeue);
    }
}