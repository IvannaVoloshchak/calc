import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        showMenu();
        double number1;
        String operation;
        double result = 0;
        double memoryNum=0;

        do {
            Scanner scanner = new Scanner(System.in);
            operation = getOperation(scanner);

            switch (operation) {
                case "+":
                   result= add();
                    break;
                case "-":
                    result = subtract();
                    break;
                case "*":
                    result = multiply();
                    break;
                case "/":
                    result = divide();
                    break;
                case"m":
                  memoryNum= getMemory(result);
                    break;
                case "m+":
                   result= memoryPlus(memoryNum);
                    break;
                case"m-":
                   result= memorySubtract(memoryNum);
                    break;
                case "mc":
                   result= setMemory(memoryNum);// work not so as I aspect
                    break;
               case "s-":
                    result = sameMinus(result);
                    break;
                case "s+":
                 result =   samePlus(result);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            printOperation( result);
        } while (true);
    }

    static String getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  number:");
        String number = scanner.next();
        if (number.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        return number;
    }
    static double number1(){
        double number1 = Double.parseDouble(getNumber());
                return  number1;
    }
    static double number2() {
        double number2 = Double.parseDouble(getNumber());
        return number2;
    }
    static String getOperation(Scanner scanner) {
        System.out.println("Choose operation:");
        String operations = scanner.next();
        if (operations.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        return operations;
    }
    static double add(){
        return  number1() + number2();

    }

    static double subtract(){
        return number1()-number2();
    }

    static double multiply() {
        return   number1()*number2();
    }

    static double divide() {
        if (number2() == 0) {
            System.out.println("Sorry, you cant divide by 0");
        }
        return number1()/number2();
    }

    static void printOperation( double result) {
        System.out.println("The current value is  = " + result);
    }

    static double getMemory(double result) {
        double memoryNum = result;
        return memoryNum;
        }
        static double memoryPlus(double memoryNum){
            return number1()+memoryNum;
        }
    static double memorySubtract(double memoryNum){
        return  number1()-getMemory(memoryNum);
    }
    static double setMemory(double memoryNum){ //помилка все одно пам'ятає те число яке пішло в пам'ять
        getMemory(memoryNum);
        memoryNum=0.0;
        return memoryNum;
    }

    static double sameMinus(double result) {
           return  number1() - result;
    }

    static double samePlus(double result) {
            return  number1() + result;
    }

    static void showMenu() {
        System.out.println("This calculator has next operation:" +
                "\n + enter to add numbers;" +
                "\n - enter to subtract;" +
                "\n * enter to multiply;" +
                "\n / enter to divide;" +
                "\n m if u want to work with current result in the future and put it in memory;"+
                "\n m+ if u want to add number to memory value "+
                "\n m- if u want to subtract number to memory value "+
                "\n mc if u want to clear memory"+
                "\n s+ if u want to add some other num to current value;"+
                "\n s- if you want to subtract other number from current value;"+
                "\n q pres it if you want leave leave the program");
    }
}









