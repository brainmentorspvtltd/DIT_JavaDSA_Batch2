package ArrayStrings;

public class P6_AnagramString {
    static final int CHAR = 256;
    static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        int count[] = new int[CHAR];
        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i = 0; i < CHAR; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        System.out.println(isAnagram(s1, s2));
    }
}
