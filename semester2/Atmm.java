import java.util.Scanner;

public class Atmm {
    
   
 public static void main(String[] ar)
 {
     double balance=1000;
     System.out.println(" enter  pin ");

     Scanner sc=new Scanner(System.in);

     int pin=sc.nextInt();

     if(pin!=1234)
     {
            System.out.println("pin is not corretc");
     }
     else{
         System.out.println("enter amount");
        double amount=sc.nextDouble();
        balance= balance-amount;
        System.out.println("success");
     }
     System.out.println("the balance is "+balance);
 }
}
