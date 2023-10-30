import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_PrintSequence {
    public static void main(String[] args) {

        //Take input from the user
        //Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        int t1 = 0;
        int t2 = 1;
        System.out.println("Enter the number : ");
        int n = sc.nextInt();  //Declare and Initialize the number of terms
        //Print the fibonacci series
        for (int i = 1; i <=n; i++){
            System.out.println(t1 + " ");
            int sum =t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
