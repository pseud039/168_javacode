public class ExceptionExample{
    public static void main(String[] args) {
        try{
        System.out.println("2");
        System.out.println("12");
        System.out.println(1/0);
        }catch(ArithmeticException e){
            System.err.println("Cannot divide by 0");
        }finally{
        System.out.println("we");
        System.out.println("sd");
        System.out.println("13");

        }
    }
}