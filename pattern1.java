public class pattern1 {
    public static void main(String[] args) {
        int n = 5; // Height of the pyramid

        // Hollow pyramid pattern
        for (int i = 1; i < n; i++) { // Looping till n-1 to avoid printing the middle row twice
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow effect
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Middle solid row
        for (int i = 1; i <= (2 * n - 1); i++) {
            System.out.print("*");
        }
        System.out.println();

        // Hollow inverted pyramid pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow effect
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
