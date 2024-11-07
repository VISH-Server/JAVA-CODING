public class pattern {
    public static void main(String[] args) {
        int n = 5; // Height of the middle rectangle (can be adjusted)

        // Top half of the diamond
        for (int i = 1; i <= n - 2; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Rectangle
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = n - 2; i >= 1; i--) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
