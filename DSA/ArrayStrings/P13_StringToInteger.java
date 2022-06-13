package ArrayStrings;

public class P13_StringToInteger {

    static int toi(String str) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int n = str.length();

        // Trimming all whitespaces from the beginning
        while(index < n && str.charAt(index) == ' ') {
            index++;
        }

        if(index < n && str.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        else if(index < n && str.charAt(index) == '+') {
            sign = 1;
            index++;
        }

        // Traversing digits one by one and stop if character is not digit
        // while(index < n && Character.isDigit(str.charAt(index))) {
        while(index < n) {
            if(!Character.isDigit(str.charAt(index))) {
                continue;
            }
            int digit = str.charAt(index) - '0';

            // checking overflow and underflow condition
            if((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = 10 * result + digit;
            index++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        int n = toi("+-12");
        System.out.println(n);
    }
}