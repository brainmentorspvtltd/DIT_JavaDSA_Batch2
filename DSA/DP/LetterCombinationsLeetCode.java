package BackTracking;

import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
import java.util.List;

public class LetterCombinationsLeetCode {
    static String keyPadKeys[] = {"","+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String number) {
        if(number.length() == 0){
            List<String> str = new ArrayList<>();
            return str;
        }
        List<String> res = backTrack(number);
        return res;
    }
    private static List<String> backTrack(String number) {
        if(number.length() == 0){
            List<String> str = new ArrayList<>();
            str.add("");
            return str;
        }
        char firstChar = number.charAt(0);
        String remainingString = number.substring(1);
        // '2' -> 2
        int index = firstChar - '0';
        String keyPadKey = keyPadKeys[index];
        List<String> result = new ArrayList<>();
        for(int i = 0; i < keyPadKey.length(); i++) {
            List<String> temp = backTrack(remainingString);
            for(String s : temp) {
                result.add(keyPadKey.charAt(i) + s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // keyPadKeys.put("2", "abc");
        System.out.println(keypad("23"));
    }
}
