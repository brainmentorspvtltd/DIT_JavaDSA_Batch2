package ArraysProblems;

public class P14_MissingNumber {
    
    static void approach_1(int arr[], int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int total = (n) * (n+1) / 2;
        int missing = total - sum;
        System.out.println("Missing Number is : " + missing);
    }

    static void approach_2(int arr[], int n) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++) {
            x = x ^ arr[i];
        }
        for(int i = 0; i <= n; i++) {
            y = y ^ i;
        }
        int missing = x ^ y;
        System.out.println("Missing Number is : " + missing);
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,5,6,7,8};
        int arr[] = {3,0,1};
        int n = arr.length;
        approach_1(arr, n);
    }
}


// Runtime: 1 ms, faster than 67.17% of Java online submissions for Missing Number.
// Memory Usage: 50.6 MB, less than 68.27% of Java online submissions for Missing Number.