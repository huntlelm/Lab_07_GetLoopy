public class Task07 {
    public static void main(String[] args) {

        // Loop to print 5x5 Square of Stars
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("* ");
            }
            System.out.println(); // This creates a new row
        }
    }
}