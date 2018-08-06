import java.util.Scanner;

public class Something {
    public static void main(String[] args) {
        double number1;
        double number2;
        double result = 0.0;
        // String operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number1 = scanner.nextDouble();

        System.out.println("Enter other number");
        number2 = scanner.nextDouble();

        System.out.println("Choose operation: ");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                result = number1 + number2;
                // System.out.println(result);
                break;
            case "-":
                result = number1 - number2;
                // System.out.println(result);
                break;
            case "*":
                result = number1 * number2;
                // System.out.println(result);
                break;
            case "/":
                result = number1 / number2;
                // System.out.println(result);
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);


//       class add (double num, do) {
//            result = number1+number2;
//
//        }
    }
}
