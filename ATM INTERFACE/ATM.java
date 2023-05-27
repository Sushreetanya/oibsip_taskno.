import java.util.Scanner;  

public class ATM{
 
    
    public static void main(String  args[])  
    {  
        
         int balance = 300000;
         int withdraw;
         int deposit; 
         int attempt=1;
         

        try (Scanner sc = new Scanner(System.in)) {
            int pin=2556;

            
   
   
            System.out.println("x:Enter PIN:");
            int p=sc.nextInt();

            if(p!=pin){
                 while(true)  
            {  
                System.out.println("You have entered wrong pin!!");  
                System.out.println();
                attempt++;

                System.out.println("Please re=enter the pin:");
                p=sc.nextInt();
                
                if(p==pin){
                    break;
                }

                if(attempt==5){

                
                System.out.println("You have exceed your trail!!!");  
                System.out.println("Retry!!! After some time...");  
                break;
                }
            }
   }

                  
   if(p==pin){
            System.out.println("x:---------------WELCOME TO ATM SERVICE-----------------");
            System.out.println();
            System.out.println("x:Choose option from the below which one you want:");
            System.out.println("x:1.Check Balance");
            System.out.println("x:2:Withdraw");
            System.out.println("x:3.Deposit");
            System.out.println("x:4.Quit");

            System.out.println();

            
            int choice=sc.nextInt();

            switch(choice){

                case 1:
                System.out.println("x:1.Check Balance");
                System.out.println("Your balance is:" + balance);
                System.out.println();
                break;


                case 2:
                System.out.println("x:2.Withdraw");
                System.out.println("x:Enter the amount you want to withdraw: ");
                withdraw =sc.nextInt();

                if(withdraw>balance || balance==0){
                    System.out.println("x:You have insufficient balance!!");
                    System.out.println();
                    break;
                }

                System.out.println("x:Hope you collected your amount....");
                balance=balance-withdraw;
                System.out.println();
                break;

            case 3:
                System.out.println("x:3.Deposit");
                System.out.println("x:Enter the money you want to be deposited:");
                 deposit = sc.nextInt();

                    
                    balance=balance+deposit;
                System.out.println("x:Your Money has successfully deposited....");
                System.out.println();   
                break;

            case 4:    
                System.out.println("x:Thank You for using our service");
                System.out.println();
                break;
               }
           }
       }
   }
}
