import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        showMenu();
        double number1;
        String operation;
        double result = 0;
        double memoryNum;

        do {
            Scanner scanner = new Scanner(System.in);
            number1 = Double.parseDouble(getNumber(scanner));
            operation = getOperation(scanner);
            double number2 = Double.parseDouble(getNumber(scanner));

            switch (operation) {
                case "+":
                    result = add(number1, number2);
                    break;
                case "-":
                    result = subtract(number1, number2);
                    break;
                case "*":
                    result = multiply(number1, number2);
                    break;
                case "/":
                    result = divide(number1, number2);
                    break;
//                case"m":
//                    double memoryPoint = getMemory(result);
//                    break;
//                case "m-":
//                    memoryMinus(number,result);
//                    break;
//                case "m+":
//
//                    memoryPlus(result, number);
//                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            printOperation(number1, operation, number2, result);
        } while (true);
    }

    static String getNumber(Scanner scanner) {
        System.out.println("Enter  number:");
        String number = scanner.next();
        if (number.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        return number;
    }

    static String getOperation(Scanner scanner) {
        System.out.println("Choose operation:");
        String operations = scanner.next();
        if (operations.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        return operations;
    }

    static double add(double number1, double number2) {
        return number1 + number2;
    }

    static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Sorry, you cant divide by 0");
        }
        return number1 / number2;
    }

    static void printOperation(double number1, String operation, double number2, double result) {
        System.out.println("The current value is " + number1 + operation + number2 + " = " + result);
    }

    static double getMemory(double result) {
        double memoryNum = result;
        System.out.println(memoryNum);
        return memoryNum;
    }

    static double memoryMinus(double number, double result) {
        result = number - getMemory(result);
        System.out.println(result);
        return result;
    }

    static double memoryPlus(double result, double number) {
        result = number + getMemory(result);
        System.out.println(result);
        return result;
    }

    static void showMenu() {
        System.out.println("This calculator has next operation:" +
                "\n + enter to add numbers;" +
                "\n - enter to subtract;" +
                "\n * enter to multiply;" +
                "\n / enter to divide" +
                "\n q pres it if you want leave leave the program");
    }
}









