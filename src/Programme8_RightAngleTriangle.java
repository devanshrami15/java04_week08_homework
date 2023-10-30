/**
 * Display right angle triangle of @ using nested for loops.
 */

public class Programme8_RightAngleTriangle {
    public static void triangle(int n) {

        for (int row = 1; row <= n; row++) {
            int a, b;

            // outer loop to handle number of rows
            // k in this case
            for (a = 0; a < n; a++) {

                // inner loop to handle number of columns
                // values changing acc. to outer loop
                for (b = 0; b <= a; b++) {
                    // printing stars
                    System.out.print("@ ");
                }

                // end-line
                System.out.println();
            }
        }
    }

    // Driver Function
    public static void main(String[] args) {
        int k = 5;
        triangle(k);
    }
}
//}

