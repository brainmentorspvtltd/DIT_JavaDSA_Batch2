package ArraysProblems;

public class P8_RotateArrayOnce {
    static void rotateOnce(int arr[], int n) {
        int x = arr[n-1];
        for(int i = n - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    } 
    
    static void rotateOnceP2(int arr[], int n) {
        int i = 0;
        int j = n-1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        // rotateOnce(arr, n);
        rotateOnceP2(arr, n);
    }
}
