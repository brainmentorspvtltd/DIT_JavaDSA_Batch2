public class TimeComplexity {
    public static void main(String[] args) {
        // Time Complexity O(N)
        int n = 10;
        for(int i = 0; i < n; i++) {

        }

        for(int i = 0; i < n; i+=2) {

        }

        for(int i = n; i >= 1; i--) {

        }


        // Time Complexity o(logN)
        for(int i = 1; i <= n; i*=2) {

        }

        for(int i = n; i >= 1; i=i/2) {

        }

        for(int i = 2; i < n; i = (int)Math.pow(i, 2)) {

        }
    }    
}
