import java.util.Scanner;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */


public class Programme13SharedDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int a = sc.nextInt();
        System.out.println("Input the second number : ");
        int b =sc.nextInt();
        System.out.println("Result: " + findHasShareDigit(a,b));
        sc.close();
    }
    public static boolean findHasShareDigit(int p, int q) {
    if (p < 10 || q > 99){
        return false;
    }
        int x = p % 10;
        int y = q % 10;
        p/=10;
        q/=10;

            if( p == q || p == y || x == q || x == y){
                return true;
            }
            return false;


    }
}




