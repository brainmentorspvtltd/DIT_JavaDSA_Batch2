package DP;

public class P3_LCS {

    static int lcs(String first, String second) {
        if(first.length() == 0 || second.length() == 0) {
            return 0;
        }
        int count = 0;
        if(first.charAt(0) == second.charAt(0)) {
            count = 1 + lcs(first.substring(1), second.substring(1));
        }

        else {
            int result1 = lcs(first.substring(1), second);
            int result2 = lcs(first, second.substring(1));
            count = Math.max(result1, result2);
        }
        return count;
    }

    public static void main(String[] args) {
        String first = "abbg";
        String second = "agbg";
        int len = lcs(first, second);
        System.out.println("Length is : " + len);
    }
}
