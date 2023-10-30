/**
 * Display left angle triangle of * using nested for loops.
 */

public class Programme15_LeftAngleTriangle {
    public static void leftTriangle(int k){
        int a,b;

        for (a=0; a<k; a++){
            for(b=2 * (k-a); b>=0; b--){
                System.out.print(" ");
            }
            for (b=0; b<= a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int k =5;
        leftTriangle(k);
    }
}
