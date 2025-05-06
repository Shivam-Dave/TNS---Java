import com.yourname.assignment.employees.*;
import com.yourname.assignment.utilities.EmployeeUtilities;


// Main class to test Employee, Manager, Developer and Utilities.

public class AssignmentMain {
    public static void main(String[] args) {
        Manager m = new Manager("Shivam", "M001", 85000, "Sales");
        Developer d = new Developer("Rishi", "M002", 75000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(m);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(d);

        System.out.println("\nGiving 10% raise to both...");

        EmployeeUtilities.giveRaise(m, 10);
        EmployeeUtilities.giveRaise(d, 10);

        System.out.println("\nAfter Raise:");
        EmployeeUtilities.printEmployeeDetails(m);
        EmployeeUtilities.printEmployeeDetails(d);
    }
}
