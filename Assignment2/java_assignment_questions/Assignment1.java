import java.util.Scanner;


//  Assignment Question 1
//  A simple Java program to take user details and display them.
 
public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name with Initial: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        System.out.print("Enter Percentage: ");
        String percentage = scanner.nextLine();

        System.out.println("\nOutput:");
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);

        scanner.close();
    }
}
