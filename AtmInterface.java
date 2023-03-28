import java.util.Scanner;
public class AtmInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        int deposit=0;
        int withdraw=0;
        System.out.println("ATM INTERFACE");
        System.out.println("Enter the pin");
        int pin;
        pin=sc.nextInt();
        if(pin==1808){
System.out.println("Enter the option you want");
while(true){

    System.out.println("Choose 1 for Withdraw");
    System.out.println("Choose 2 for Deposit");
    System.out.println("Choose 3 for Transfer");
    System.out.println("Choose 4 for Check balance");
    System.out.println("Choose 5 for Transaction History");
    System.out.println("Choose 6 for Exit");

    int choice=sc.nextInt();

    switch(choice){
        case 1:
        System.out.println("******WITHDRAW*****");
        System.out.println("Enter the amount to be withdrawn:");
        withdraw=sc.nextInt();
        if(balance>=withdraw){
            balance=balance-withdraw;
            System.out.println("Please collect your money");
            System.out.println("Available balance"+balance);
        }
        else{
            System.out.println("Insufficent balance");
        }
        break;

        case 2:
        System.out.println("****DEPOSIT****");
        System.out.println("Enter the amount to be deposited:");
        deposit=sc.nextInt();
        balance=balance+deposit;
        System.out.println("Avaliable Balance:"+balance);
        break;
        
        case 3:
        System.out.println("****TRANSFER****");
        System.out.println("Enter the account number");
        int accountNumber=sc.nextInt();
        System.out.println("Enter IFSC Code");
        int ifscCode=sc.nextInt();
        System.out.println("Enter the amount to be transfered:");
        int amount=sc.nextInt();
        balance=balance-amount;
        System.out.println("Available balance is"+balance);
        break;

        case 4:
        System.out.println("****CHECK BALANCE****");
        System.out.println("Avaliable Balance"+balance);
        break;
        
        case 5:
        System.out.println("****TRANSCATION HISTORY");
        System.out.println("Deposit amount"+deposit);
        System.out.println("Withdraw Amount : "+withdraw);
        System.out.println("Balance Amonut : "+balance);
        break;

        case 6:
        System.out.println("Thank you Visit Again!!!");
    }
}
    }
    else{
        System.out.println("You entered Wrong Pin");
    }
}
}
