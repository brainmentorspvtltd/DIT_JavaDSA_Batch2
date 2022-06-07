package ArrayStrings;

public class P2_SubstringPalindrome {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i <= j) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(c1 != c2) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    static void solution(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if(isPalindrome(ss)) {
                    System.out.println(ss);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "abccbc";
        solution(str);
    }
}
