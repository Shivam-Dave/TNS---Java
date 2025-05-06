import java.util.Scanner;


//  Assignment Question 3
//  Class Circle with methods to input radius and calculate area.
 
public class Circle {
    double radius;
    String colour;

    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter colour: ");
        colour = scanner.nextLine();
    }

    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Colour: " + colour);
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
