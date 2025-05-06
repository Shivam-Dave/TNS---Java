public class BankAccount {
    private int accountNumber;
    private double balance;
    
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // deposit money 
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited ₹" + amount);
    }

    //  withdraw money
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for the withdrawal.");
        }
        balance -= amount;
        System.out.println("Successfully withdrew ₹" + amount);
    }

    //display current balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Current Balance: ₹" + balance);
    }
}
