package ArrayStrings;

public class P5_StringPermutation {
    static int factorial(int n) {
        int val = 1;
        for(int i = 2; i <= n; i++){
            val *= i;
        }
        return val;
    }    
    static void solution(String str) {
        int n = str.length();
        int f = factorial(n);
        for(int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int j = n; j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        solution(str);
    }
}
