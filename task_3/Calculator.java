package task_3;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LOGGER.info("Enter first number: ");
        double num1 = scanner.nextDouble();

        LOGGER.info("Enter second number: ");
        double num2 = scanner.nextDouble();

        LOGGER.info("Enter operation to perform (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                LOGGER.warning("Invalid operator");
                return;
        }

        LOGGER.info("Result: " + result);
    }
}