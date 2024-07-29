package question3;

import java.util.Scanner;

public class Account {
   private double balance = 0;
    private String accountNO;

    public double getBalance(){
        return this.balance ;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountNO(){
        return this.accountNO;
    }

    public void setAccountNO(String accountNO){
        this.accountNO = accountNO;
    }


    public Account() {

    }

    public Account(double balance,String accountNO) {
        this.balance = balance;
        this.accountNO = accountNO;
    }

    public void deposit(double depositAmount) {
        if (depositAmount>0) {
            this.balance = this.balance + depositAmount;
            displayBalance();
        }
        else {
            System.out.println("Enter a valid amount to deposit");
        }
    }

    public void withdraw(double withDrawAmount) {

        if (this.balance >= withDrawAmount) {
            this.balance = this.balance - withDrawAmount;
            displayBalance();
        }
        else{
            System.out.println("Insufficient Balance");
            displayBalance();
        }
    }

    public void displayBalance() {
        System.out.println("Your Account Balance is " + this.balance);
    }

    public static void main(String[] args) {
        Account obj = new Account();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter deposit amount");
    double deposit = scanner.nextDouble();
    obj.deposit(deposit);
    System.out.println("Enter withdraw amount");
    double withDraw = scanner.nextDouble();
    obj.withdraw(withDraw);
 }
}
