package ArrayStrings;

import java.util.ArrayList;

public class P9_RabinKarpPattern {
    public static void main(String[] args) {
        /*
         * 1. Slide the pattern one by one
         * 2. Do the better hash
         * 3. If hash are same then comparen the characters
         * 4. Repeat step 1 again still string exhaust
         */
        ArrayList<Integer> list = new ArrayList<>();
        String str = "batmanandrobinarebat";
        String pattern = "bat";
        int n = str.length();
        int p = pattern.length();
        int d = pattern.length();
        int x = 1;
        // int d = 256;
        int q = 13;
        int stringHash = 0;
        int patternHash = 0;

        // pow(d, p-1) % q
        for(int i = 0; i < p-1; i++) {
            x = (x * d) % q;
        }

        for(int i = 0; i < p; i++) {
            patternHash = (patternHash * d + (pattern.charAt(i))) % q;
            stringHash = (stringHash * d + str.charAt(i)) % q;
        }
        // System.out.println(patternHash + "," + stringHash);
        for(int i = 0; i <= n - p; i++) {
            if(patternHash == stringHash) {
                int j;
                for(j = 0; j < p; j++) {
                    if(pattern.charAt(j) != str.charAt(i + j)) {
                        break;
                    }
                }
                if(j == p) {
                    System.out.println("Pattern Match : " + i);
                    list.add(i+1);
                }
            }

            // Recompute str hash only
            if(i < n - p) {
                // Remove old string hash of slide
                stringHash = stringHash - (str.charAt(i) * x);
                // Add the new char hash of slide
                stringHash = ((stringHash * d + str.charAt(i + p))) % q;
                if(stringHash < 0) {
                    stringHash = stringHash + q;
                }
            }

        }
    }    
}
