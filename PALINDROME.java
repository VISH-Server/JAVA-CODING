import java.util.Scanner;

public class PALINDROME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ansl = 0;
        String s, ans = "";
        System.out.println("Enter a string");
        s = sc.next();
        n = s.length();
        String str = "", rev = "";
        // int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            
            for (int j = i; j < n; j++) 
            {
                str += s.charAt(j);
                rev = s.charAt(j) + rev;
                //System.out.println(str + " " + rev);
                if (str == rev && ansl < str.length()) {
                    System.out.println("hi");
                    ansl = str.length();
                    ans = str;
                }
            }
            System.out.println(ans);
        }
        System.out.println(ans);
        sc.close();

    }
}