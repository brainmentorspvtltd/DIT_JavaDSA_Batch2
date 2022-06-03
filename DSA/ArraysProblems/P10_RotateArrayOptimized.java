package ArraysProblems;

public class P10_RotateArrayOptimized {
    static void reverse(int arr[], int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int k = 3;
        k = k % n;  // range case handle
        // negative case handle
        if(k < 0) {
            k = n + k;
        }
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
}
