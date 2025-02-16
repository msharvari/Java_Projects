import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter the operation you would like to perform (+, -, *, /, ^): ");
        String operator = input.next();
        double result;
        switch(operator) {
        case "+":
            result = num1 + num2;
            System.out.println("The result is: " + result);
            break;
        case "-":
            result = num1 - num2;
            System.out.println("The result is: " + result);
            break;
        case "*":
            result = num1 * num2;
            System.out.println("The result is: " + result);
            break;
        case "/":
            result = num1 / num2;
            System.out.println("The result is: " + result);
            break;
        case "^":
        	result = Math.pow(num1, num2);
            System.out.println("The result is: " + result);
            break;
        default:
            System.out.println("Invalid operator entered");
            break;
	}

	}}
