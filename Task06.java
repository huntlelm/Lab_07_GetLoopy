public class Task06 {
    public static void main(String[] args) {

        // Loop to print right triangle of stars
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 6 - row; column++) {
                System.out.print("* ");
            }
            System.out.println(); // This creates a new row
        }
    }
}