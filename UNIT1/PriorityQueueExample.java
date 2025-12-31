import java.util.PriorityQueue;

public class PriorityQueueExample{

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Queue is: "+pq);

        System.out.println("Added using offer: "+pq.offer(3));
    }
}