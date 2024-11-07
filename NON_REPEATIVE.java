public class NON_REPEATIVE {
    public static char findFirstNonRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return currentChar;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "I LOVE YOU NIRUPAMA";
        char firstNonRepeated = findFirstNonRepeatedChar(input);
        
        if (firstNonRepeated != '\0') {
            System.out.println("The first non-repeated character is: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated characters found.");
        }
    }
}
