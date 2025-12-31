

public class StringExample{

    public static void main(String[] args) {
        String name = "TITLE";
        int len = name.length();
        System.out.println(len);
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(2, 3).toLowerCase());
        String s = "HOLA";
        if(name.equals(s)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        // Scanner sc = new Scanner();
        // sc
        
    }
}