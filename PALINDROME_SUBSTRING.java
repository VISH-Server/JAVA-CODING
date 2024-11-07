public class PALINDROME_SUBSTRING {
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < n; i++) 
        {
            dp[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) 
        {
            if (s.charAt(i) == s.charAt(i + 1)) 
            {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) 
            {
                int j = i + len - 1;
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String s = "aaaabbaa";
        String longestPalindromicSubstring = longestPalindrome(s);
        System.out.println("The longest palindromic substring is: " + longestPalindromicSubstring);
    }    
}