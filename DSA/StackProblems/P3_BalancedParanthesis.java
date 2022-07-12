import java.util.HashMap;

public class P3_BalancedParanthesis {

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(s.length());
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') && stack.isEmpty()) {
                return false;
            }
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else {
                Character currentBracket = stack.pop();
                currentBracket = map.get(currentBracket);
                if(currentBracket != s.charAt(i)) {
                    System.out.println("Invalid Brackets...");
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println("Valid Brackets...");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "()({})[]";
        String str = "()({})[]]]";
        System.out.println(isValid(str));
    }
}
