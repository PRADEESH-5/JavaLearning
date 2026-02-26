import java.util.*;

class Account{

    public String name;
    public long accNo;
    public String address;
    public int balance;

}

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        Account a=new Account();

        System.out.println("===== Update Account =====");
        System.out.print("Enter your name: ");
        a.name=sc.nextLine();
        System.out.print("Enter your Account number: ");
        a.accNo=sc.nextLong();
        System.out.print("Enter your Address: ");
        a.address=sc.next();
        System.out.print("Enter your initial balance: ");
        a.balance= sc.nextInt();

        do{
            System.out.println("Enter your choice: ");
            System.out.println("1. View Details");
            System.out.println("2. View balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch= sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Details: ");
                    System.out.println("Account name: "+a.name);
                    System.out.println("Account no.: "+a.accNo);
                    System.out.println("Address: "+a.address);
                    break;
                case 2:
                    System.out.println("Account no.: "+a.accNo);
                    System.out.println("Balance: "+a.balance);
                    break;
                case 3:
                    System.out.println("Account no.: "+a.accNo);
                    System.out.print("Enter the amount to : ");
                    a.balance+=sc.nextInt();
                    break;
                case 4:
                    System.out.println("Account no.: "+a.accNo);
                    System.out.print("Enter the amount to withdraw: ");
                    a.balance-=sc.nextInt();
                    break;
            }
        }while(ch!=5);

    }
}
