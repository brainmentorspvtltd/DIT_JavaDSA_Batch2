package ArrayStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P4_ReverseWordsInAString {
    static String reverse(String wordStr) {
        int i = 0;
        int j = wordStr.length() - 1;
        char wordArr[] = wordStr.toCharArray();
        char temp;
        while(i < j) {
            temp = wordArr[i];
            wordArr[i] = wordArr[j];
            wordArr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(wordArr);
    }

    static String approach_1(String str) {
        String rev = reverse(str);
        // System.out.println(rev);    // whole string reverse
        String words[] = rev.split(" ");
        String sentence = "";
        for(String word : words) {
            if(word.equals("")) {
                continue;
            }
            sentence += reverse(word) + " ";
        }
        sentence = sentence.trim();
        // System.out.println(sentence);
        return sentence;
    }

    static String approach_2(String str) {
        String wordArr[] = str.split(" ");
        String sentence = "";
        int n = wordArr.length;
        for(int i = n-1; i >= 0; i--) {
            if(wordArr[i].equals("")) {
                continue;
            }
            sentence += wordArr[i] + " ";
        }
        // System.out.println(sentence);
        return sentence;
    }

    static String approach_3(String str) {
        List<String> wordsList = Arrays.asList(str.split(" "));
        Collections.reverse(wordsList);
        return String.join(" ", wordsList);
    }

    public static void main(String[] args) {
        // String str = "Welcome to brain mentors";
        String str = "a good      example";
        // approach_1(str);
        String op = approach_2(str);
        System.out.println(op);
    }
}
