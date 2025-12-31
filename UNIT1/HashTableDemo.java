import java.util.Hashtable;

public class HashTableDemo{
public static void main(String[] args) {
    Hashtable<Integer,String> table = new Hashtable<>();
    table.put(1,"A");
    table.put(2,"C");
    System.out.println(table);
    System.out.println(table.putIfAbsent(4,"Hii"));
}
}
// import java.util.Hashtable;
// public class HashTableDemo{
//     public static void main(String[] args){
//         Hashtable<Integer, String> table=new Hashtable<>();

//         table.put(1, "Abc");
//         table.put(4, "Xyz");

//         System.out.println("Our Hashtable is:"+table);
//     }
// }