package Recursion;

import java.util.ArrayList;

public class P11_StringSubsequence {
    static ArrayList<String> subSeq(String str) {
        if(str.length() == 0) {
            ArrayList<String> emptyString = new ArrayList<>();
            emptyString.add("");
            return emptyString;
        }
        char currentChar = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> temp = subSeq(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            result.add(s);
            result.add(currentChar + s);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ravi";
        System.out.println(subSeq(str));
    }
}
