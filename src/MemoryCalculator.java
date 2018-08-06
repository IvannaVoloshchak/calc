public class MemoryCalculator {
    private double currentValue;

    public double getCurrentValue(){
        System.out.println("The current value is "+ currentValue);
        return 0;
    }
    public void add (double operand2){
        currentValue=currentValue+operand2;
        getCurrentValue();
    }
    public void subtract(double operand2){
        currentValue= currentValue-operand2;
        getCurrentValue();
    }
    public void multiply(double operand2){
        currentValue=currentValue*operand2;
        getCurrentValue();
    }
    public void divide (double operand2){
        if(operand2%2==0){
            System.out.println("Sorry, you cant divide by 0");
        }
        currentValue=currentValue/operand2;
        getCurrentValue();
    }
    public void clear(){
        currentValue=0;
        getCurrentValue();
    }
}
