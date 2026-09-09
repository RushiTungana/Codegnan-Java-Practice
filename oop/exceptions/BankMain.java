package comm.oop.exceptions;

import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount <= 0) throw new IllegalArgumentException("Invalid amount");
        else if(amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);    
    }
}
public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
