package ArrayStrings;

import java.util.Arrays;

public class P7_AllAnagramInList {
    static void approach_1(String wordArr[]) {
        String []words = wordArr.clone();
        int index = 0;
        for(String word : words) {
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            words[index] = String.valueOf(arr);
            index++;
        }
        for(int i = 0; i < words.length; i++) {
            if(i < words.length-1 && words[i].equals(words[i+1])) {
                System.out.println(wordArr[i] + wordArr[i+1]);
            }
        }
    }   
    
    // Using Hashmap
    static void approach_2() {
        // init a new hashmap
        // loop over all words one by one
        // convert to character array and sort and re-convert to string
        // calculate hashcode of string after sorting
        // Else add the word first time using list
        // Print all values where size of list > 1
    }
}
