import java.util.*;
public class task3
{
    public static void main(String args[])
    {
        int withdraw;
        int deposit;
        int balance = 55000;
        Scanner sc = new Scanner(System.in);
        String id = "abc", Pin = "9876";            

        System.out.print("Please Enter Your PIN: ");
        String in=sc.nextLine();

        if(in.equals(Pin))  //checks for pin to  match
        {
            while(true)
            {
                System.out.println("Welcome");
                System.out.println("1.Check Balance \n2.Withdraw \n3.Deposit");
                System.out.println("4.Transfer \n5.Quit");
                System.out.println("Please Select Transaction:");

                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        //display the total balance in the account
                        System.out.println("Balance: "+balance);
                        System.out.println("");
                        break;

                    case 2:       //amount to withdraw
                        System.out.println("Please Enter Amount:");
                        withdraw = sc.nextInt();
                        if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("Your Transaction is being Processed.\n Please Wait..");
                            System.out.println(" Please Collect Cash");
                        }
                        else
                            System.out.println("Insufficient Balance");
                        System.out.println("");
                        break;

                    case 3:               //amount to deposit
                        System.out.println("Enter Amount to be Deposited:");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Amount has been successfully Deposited");
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Account Based Transfer");
                        System.out.println("Enter the Amount:");
                        int amount = sc.nextInt();

                        if(amount > balance)
                            System.out.println("Transaction Failed");
                        else{
                            System.out.println("Amount successfully Transfered");
                            balance = balance - amount;
                        }
                        System.out.println("");
                        break;

                    case 5:
                                     //Exit menu
                        System.out.println("Thank You");
                        System.exit(0);
                }
            }
        }
        else
            System.out.println("Invalid PIN");
    }
}
