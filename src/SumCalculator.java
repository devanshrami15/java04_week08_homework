import java.util.Arrays;
import java.util.Random;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 *
 * Write the following methods (instance methods):
 *
 * *Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
 * *Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
 * *Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 * *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
 * *Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
 * *Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
 * *Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
 * *Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 */


public class SumCalculator {
    // write your code here
    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt(10);
        int secondNumber = random.nextInt(10);
        System.out.print(firstNumber + ", ");
        System.out.println(secondNumber + "\n");
        SumCalculator calculator = new SumCalculator();
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
        for (String s : Arrays.asList("add= " + calculator.getAdditionResult(), "subtract= "
                + calculator.getSubtractionResult(), "multiply= " + calculator.getMultiplicationResult(), "divide= "
                + calculator.getDivisionResult())) {
            System.out.println(s);

        }
    }
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult () {

        if (secondNumber != 0.0) {
            return firstNumber / secondNumber;
        } else {
            return 0.0;

            }

    }
}
