import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MemoryCalculator memoryCalculator=new MemoryCalculator();
        memoryCalculator.getCurrentValue();
        displayMenu();
    }
    public static int displayMenu(){
        Scanner input=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Clear");
            System.out.println("6. Quit");
            System.out.println(" ");
            System.out.println(" what you like to do?");
            choice=input.nextInt();
            if (choice>6||choice <1){
                System.out.println("Sorry, " +choice+ " was wrong" );
                return displayMenu();
            }
    } while (choice>6|| choice<1);
        MemoryCalculator memoryCalculator= new MemoryCalculator();
        if (choice ==5){
            memoryCalculator.clear();
            return 0;
        } else if(choice==6){
            System.out.println("Bye");
            System.exit(0);
        }
        System.out.println("what is the second number?");
        double operand2 = input.nextDouble();
        switch (choice){
            case 1:
                memoryCalculator.add(operand2);
                break;
            case 2:
                memoryCalculator.subtract(operand2);
                break;
            case 3:
                memoryCalculator.multiply(operand2);
                break;
            case 4:
                memoryCalculator.divide(operand2);
                break;
        } return displayMenu();
        }
        public static double getOperend(String prompt){
        return 0;
        }


}
