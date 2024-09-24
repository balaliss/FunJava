// InputMismatchExample.java
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("You entered: " + age);
        } catch (InputMismatchException e) {
            System.out.println("That’s not a valid number!");
        }
    }
}
