//12.	Write a Java program that perform integer divisions. The user enters two numbers, Num1 and Num2. The division of Num1 and Num 2 is displayed in the Result. If Num1 or Num2 were not an integer, the program would throw a Number Format Exception. If Num2 were Zero, the program would throw an Arithmetic Exception. 
import java.util.*;

public class IntegerDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number (Num1): ");
            String input1 = scanner.nextLine();
            System.out.print("Enter second number (Num2): ");
            String input2 = scanner.nextLine();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
        }
    }
}
