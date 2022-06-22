package Recursion;

import java.util.ArrayList;

public class P12_StringPermutations {

    static ArrayList<String> permutations(String str) {
        if(str.length() == 0) {
            ArrayList<String> blank = new ArrayList<>();
            blank.add("");
            return blank;
        }
        char currentChar = str.charAt(0);   // a
        String remainingString = str.substring(1);   // bc
        ArrayList<String> temp = permutations(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            for(int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, currentChar);
                result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str);
    }
}
