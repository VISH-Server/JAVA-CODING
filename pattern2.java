public class pattern2 {
    public static void main(String[] args) {
        int n = 10; // Starting number for the pattern
        
        int currentNumber = n; // Start printing from 'n'
        int rowLength = 4; // Initial row length
        
        // Loop to print each row
        while (currentNumber > 0) {
            // Print current row
            for (int i = 0; i < rowLength && currentNumber > 0; i++) {
                System.out.print(currentNumber + " ");
                currentNumber--; // Decrease the current number
            }
            System.out.println(); // Move to the next line
            
            rowLength--; // Decrease the length of the next row
        }
    }
}
