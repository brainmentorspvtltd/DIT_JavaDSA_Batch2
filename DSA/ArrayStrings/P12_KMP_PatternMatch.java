package ArrayStrings;

import java.util.ArrayList;

public class P12_KMP_PatternMatch {

    static void efficient(String str, int []lps) {
        int n = str.length();
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < n) {
            if(str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if(len == 0) {
                    lps[i] = 0;
                    i++;
                }
                else {
                    len = lps[len-1];
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "batmanandrobinarebat";
        String pattern = "bat";
        ArrayList<Integer> list = new ArrayList<>();
        int n = str.length();
        int p = pattern.length();
        int lps[] = new int[pattern.length()];
        efficient(str, lps);
        int i = 0;
        int j = 0;
        while(i < n) {
            if(pattern.charAt(j) == str.charAt(i)) {
                i++;
                j++;
            }
            if(j == p) {
                System.out.println("Pattern Found : " + (i-j));
                list.add(i-j);
                j = lps[j-1];
            }
            else if(i < n && pattern.charAt(j) != str.charAt(i)) {
                if(j == 0) {
                    i++;
                }
                else {
                    j = lps[j-1];
                }
            }
        }
    }
        
        
}
