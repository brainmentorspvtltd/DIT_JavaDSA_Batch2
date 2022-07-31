public class CountSet {
    public static void main(String[] args) {
        // TC : 0(Total Bits in n)
        int res = 0;
        int n = 5;
        /*
        while(n > 0) {
            // if(n % 2 != 0) {
            //     res++;
            // }
            // n = n/2;

            if((n & 1) == 1) {
                res++;
            }
            n = n >> 1;
        }
        */

        // TC : 0(Set Bit Count)
        while(n > 0) {
            n = (n & (n-1));
            res++;
        }
        System.out.println("Result is : " + res);
    }
}
