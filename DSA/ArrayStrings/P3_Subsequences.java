package ArrayStrings;

import java.util.ArrayList;

public class P3_Subsequences {
    static void solution(String str) {
        ArrayList<String> subSeq = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            char firstChar = str.charAt(i);
            if(subSeq.size() == 0) {
                subSeq.add("");
                subSeq.add("" + firstChar);
                continue;
            }
            int subLen = subSeq.size();
            for(int j = 0; j < subLen; j++) {
                if(!subSeq.contains("" + firstChar)) {
                    subSeq.add("" + firstChar);
                }
                String temp = subSeq.get(j) + firstChar;
                if(!subSeq.contains(temp)) {
                    subSeq.add(temp);
                }
            }
        }
        System.out.println(subSeq);
    }

    public static void main(String[] args) {
        String str = "ravi";
        solution(str);
    }
}
