package question3;

public class Account {
    double balance;

    public Account(){

    }

    public Account(double deposit,double withDraw){

    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    public void displayBalance()
    {
        System.out.println(balance);
    }

}
