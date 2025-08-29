// class 29-08
import java.math.BigInteger;
import java.util.Scanner;

class Encap{
    private BigInteger  Account_balance;
    private int upi_pin = 9899;

public void setBalance(BigInteger balance){
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter upi pin");
    int pin = sc.nextInt();
    if(pin == upi_pin){
        Account_balance = balance;
        System.out.println("Congrats");
    }else{
        System.out.println("Salary not credited");
    }
}
public int getBalance(){
    Scanner sc = new Scanner(System.in);
    System.out.println("To know the balance enter UPI PIN");
    int pin = sc.nextInt();
    if(pin== upi_pin){
        System.out.println("BALANCE: "+ Account_balance);
    }else{
        System.out.println("Wrong Pin");
    }
        return -1;
}
}
public class EmployeeEncap{
    public static void main(String[] args) {
        Encap ee = new Encap();
        ee.setBalance(new BigInteger("3243123123213123123"));
        ee.getBalance();
    }
}
