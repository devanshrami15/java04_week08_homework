import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */
//
public class Programme2_Min_MaxNumber {
    public static void main(String[] args)
    {
        int i = 1;

        while (i <= 5)
        {
            int smallest = 0;
            int largest = 0;

            System.out.println("Enter number: ");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            ///input.close();
            System.out.println("Amount of numbers entered: " + i);

            System.out.println("Number entered: " + number);

            if (number < smallest) {
                smallest = number;
            }
            System.out.println("Smallest # so far: " + smallest);

            if (number > largest)
            {
                largest = number;
            }
            System.out.println("Largest # so far: " + largest);


            i++;
            input.close();
        }
    }
}