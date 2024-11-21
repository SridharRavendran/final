public class Calc{
    public static void main(String[] args) {
        // Hardcoded inputs
        double num1 = 25;
        double num2 = 5;
        char operation = '+'; // Change this to '-', '*', or '/' for other operations

        double result = 0;

        // Perform the operation
        switch (operation) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        // Print the result
        System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);
    }
}
