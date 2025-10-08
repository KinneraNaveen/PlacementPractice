package oops;
 class BankAccount {
    private String holder;
    private double balance;

    BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public void display() {
        System.out.println(holder + "'s Balance: " + balance);
    }
}

public class BankProject {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Naveen", 5000);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.display();
    }
}

