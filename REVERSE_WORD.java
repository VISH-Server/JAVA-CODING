
public class REVERSE_WORD 
{
    public static void main(String args[])
    {
        String word = "hello";
        String reversedWord = reverseWord(word);
        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }
    public static String reverseWord(String word) {
        if (word.length() <= 1) 
        {
            return word;
        }
        else
        {
            return reverseWord(word.substring(1)) + word.charAt(0);
        }
    }
}
