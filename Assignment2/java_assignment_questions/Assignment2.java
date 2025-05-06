import java.util.Scanner;


//  Assignment Question 2
//  Demonstrates use of constructors and conditional commission logic.
 
class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String name;
    String address;
    String phone;
    double salesAmount;

    void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount (min = 30k): ");
        salesAmount = scanner.nextDouble();
    }

    void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        System.out.println("Commission: " + commission);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Student s = new Student();

        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}
