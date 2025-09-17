import java.awt.*;
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shape Area Calculator");
        System.out.println("=====================");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Choose a shape (1-3): ");
        int choice = scanner.nextInt();
        Shape shape = null;
        switch (choice){
            case 1 :
                System.out.println("enter the radius");
                double radius = scanner.nextDouble();
                Shape shape = null;
                break;

            case 2:
                System.out.println("enter the length");
                double length = scanner.nextDouble();
                System.out.println("enter the width");
                double width = scanner.nextDouble();
                break;

            case 3:
                System.out.println("enter the base");
                double base = scanner.nextDouble();
                System.out.println("enter the height");
                double height = scanner.nextDouble();
                break;

            default:
                System.out.println("invald the choice ! please the right choice");
                scanner.close();
                return;



        }
        double area = shape.calculateArea();
        System.out.printf("The area is: %.2f%n", area);

        scanner.close();

    }
}
