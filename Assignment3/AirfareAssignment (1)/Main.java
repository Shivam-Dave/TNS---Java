import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (true) {
            System.out.println("Enter your choice (1 : AirIndia, 2 : KingFisher, 3 : Indigo):");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                break; // valid choice
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Enter the number of hours:");
        int hours = scanner.nextInt();

        System.out.println("Enter the cost per hour:");
        double costPerHour = scanner.nextDouble();

        Airfare airfare;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                airfare = null; // Should never reach here due to loop check
        }

        double totalAmount = airfare.calculateAmount();
        System.out.printf("Total amount: %.2f\n", totalAmount);

        scanner.close();
    }
}
