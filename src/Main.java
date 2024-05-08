import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
            Test Data:
            Input first number: 125
            Input second number: 24
            Expected Output :
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5*/


        //Scanner for inputing data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the Second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum: " + Math.addExact(firstNumber,secondNumber));
        System.out.println("Subtract: " + Math.subtractExact(firstNumber,secondNumber));
        System.out.println("multiply: " + firstNumber * secondNumber);
        System.out.println("divide: " + firstNumber / secondNumber);
        System.out.println("remainder: " + firstNumber % secondNumber);
    }
}