import java.util.Scanner;

/**
 * write a java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */


public class Programme3_PrintVowel {

    public void method(){
    Character ch;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the alphabet : ");
        char ch = sc.next().charAt(0);
        sc.close();

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
            System.out.println("Given character is an vowel");
        }else{
            System.out.println("Given Character is consonant");
        }

    }
}
