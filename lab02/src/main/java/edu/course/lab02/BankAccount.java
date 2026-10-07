package edu.course.lab02;

public class BankAccount {
    
    private int balance;

    public BankAccount(int initialBalance) {
      if  (initialBalance<0){
        throw new IllegalArgumentException("net deneg");
      }

        this.balance=initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount <=0){
            throw new IllegalArgumentException("net deneg"); 
        }

        this.balance+=amount;
    }

    public void withdraw(int amount){
        if (amount <= 0 || amount > this.balance){
            throw new IllegalArgumentException("net deneg");   
        }

        this.balance -= amount;
    }
}