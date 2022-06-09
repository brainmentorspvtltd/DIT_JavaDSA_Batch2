package ArrayStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
    static void approach_2(String arr[]) {
        // init a new hashmap
        HashMap<String, List<String>> map = new HashMap<>();
        // loop over all words one by one
        for(int i = 0; i < arr.length; i++) {
            String word = arr[i];
            // convert to character array and sort and re-convert to string
            char []letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            // calculate hashcode of string after sorting
            if(map.containsKey(newWord)) {
                map.get(newWord).add(word);
            }
            else {
                // Else add the word first time using list
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
        
        // Print all values where size of list > 1
        for(String s : map.keySet()) {
            List<String> values = map.get(s);
            if(values.size() > 1) {
                System.out.println(values);
            }

        }

    }
}
