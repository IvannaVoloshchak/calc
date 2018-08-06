import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("This calculator has next operation:" +
                "\n + enter to add numbers;" +
                "\n - enter to subtract;" +
                "\n * enter to multiply;" +
                "\n / enter to divide" +
                "\n q pres it if you want leave leave the program");
        double number;
        String operation;
        double result;
        double memoryNum;

        do {
            System.out.println("Enter your number");
            Scanner scanner = new Scanner(System.in);
            number = getNumber(scanner);
            System.out.println("Choose operation:");
            operation = getOperation(scanner);
//            if (operation="m"|| operation="M"){
//
//            }
            switch (operation) {
                case "+":
                    System.out.println("Enter other num:");
                   double  number1 = getNumber(scanner);
                     add(number, operation, number1);
                    break;
                case "-":
                    System.out.println("Enter other num:");
                    number1 = getNumber(scanner);
                    subtract(number, operation, number1);
                    break;
                case "*":
                    System.out.println("Enter other num:");
                    number1 = getNumber(scanner);
                    multiply(number, operation, number1);
                    break;
                case "/":
                    System.out.println("Enter other num:");
                    number1 = getNumber(scanner);
                    divide(number, operation, number1);
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
            }
        } while (operation != "Q" || operation != "q");
        System.out.println("Calculator is off");
    }

    static double getNumber(Scanner scanner) {
        double num = scanner.nextDouble();
        return num;
    }

    static String getOperation(Scanner scanner) {
        String operations = scanner.next();
        return operations;
    }

    static double add(double number, String operation, double number1) {
        double result = number + number1;
        getCurrentValue(number, operation, number1, result);
        return result;
    }

    static double subtract(double number, String operation, double number1) {
        double result = number - number1;
        getCurrentValue(number, operation, number1, result);
        return result;
    }

    static double multiply(double number, String operation, double number1) {
        double result = number * number1;
        getCurrentValue(number, operation, number1, result);
        return result;
    }

    static double divide(double number, String operation, double number1) {
        if (number1 == 0) {
            System.out.println("Sorry, you cant divide by 0");
        }
        double result = number / number1;
        getCurrentValue(number, operation, number1, result);
        return result;
    }

    static double getCurrentValue(double number, String operation, double number1, double result) {
        System.out.println("The current value is " + number + operation + number1 + " = " + result);
        if (operation=="m") {
            getMemory(result);
        }
        return result;
    }

    static double getMemory(double result) {
        double memoryNum = result;
        System.out.println(memoryNum);
        return memoryNum;
    }
    static double memoryMinus( double number,double result ) {
        result = number - getMemory(result);
        System.out.println(result);
        return result;
    }
    static double memoryPlus(double result, double number) {
        result = number + getMemory(result);
        System.out.println(result);
        return result;
    }
}









