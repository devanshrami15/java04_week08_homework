import java.util.Scanner;

/**
 * -Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Create a Scanner like we did in the previous video.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message gInvalid Numberh. Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and so on.
 */
public class Programme1_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int i = 0;

        while(i != 10){
            System.out.println("Enter number #" + (counter + 1));
            boolean hasNextInt = sc.hasNextInt();

            if (hasNextInt){
                int number = sc.nextInt();
                sum += number;
                i++;
                counter += 1;
            }
            else{
                System.out.println("Invalid Number Entered!");
            }
            sc.next();
        }
        System.out.println("Sum of all valid 10 number enter is : " + sum);
        sc.close();
    }
}
