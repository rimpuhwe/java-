import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    static int amount = 1000;
    public static void main (String[] args) throws InterruptedException {
        // JAVA BANKING SYSTEM
        //Declare variables needed
        Scanner scanner =  new Scanner(System.in);
        showBalance();
        Thread.sleep(10000);
        System.out.print("Amount to depose on on bank account:");
        int amountDeposited = scanner.nextInt();
        System.out.printf("%d are deposited , and now the current balance is $%d\n",amountDeposited, deposit(amountDeposited));
        Thread.sleep(10000);
        System.out.print("want to withdraw? provide the amount you want:");
        int amountWithdrawal = scanner.nextInt();
        if (amountWithdrawal < amount){
            System.out.printf("you withdrawn $%d and your remaining balance is $%d", amountWithdrawal , withdrawal(amountWithdrawal));
        }
        else{
            System.out.println("insufficient fund , please recharge your account !");
        }

        scanner.close();

    }
    static void showBalance (){
        System.out.printf("the current balance is $%d\n" , amount);
    }
    static int deposit(int deposit){
        amount += deposit;
        return amount;
    }
    static int withdrawal(int amountWithdraw){
           return amount -= amountWithdraw;
    }
}
