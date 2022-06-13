package ArrayStrings;

public class P14_LongestSubstring {
    // TC : O(n3)
    static int length(String s) {
        int n = s.length();
        int res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(check(s, i, j)) {
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }

    static boolean check(String s, int start, int end) {
        int chars[] = new int[128];
        for(int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if(chars[c] > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        length("abcbacba");
    }
}
