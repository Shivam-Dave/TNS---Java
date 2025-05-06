/**
 * 
 */
public class BankingSystem {
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account = new BankAccount(12345, 5000.00);

        try {
            System.out.println("--- Initial Account Details ---");
            account.displayBalance();

            // Try depositing a valid amount
            account.deposit(2000);

            // Try withdrawing an amount larger than balance to trigger exception
            account.withdraw(8000);

        } catch (InvalidAmountException e) {
            System.out.println("InvalidAmountException Caught: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException Caught: " + e.getMessage());
        } finally {
            System.out.println("--- Final Account Details ---");
            account.displayBalance();
        }
    }
}
