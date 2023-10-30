import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int temp = n;
        int p =0;
        sc.close();

        while (n>0){
            int reminder = n % 10;
            p = (p) + ( reminder * reminder * reminder);
            n = n/10;
        }

        if (temp == p){
            System.out.println("This is Armstrong No. ");
        }else{
            System.out.println("This is not Armstrong no.");
        }
    }
}

