package ArraysProblems;

public class P6_ReverseArray {
    void reverse(int arr[], int n) {
        int i = 0;
        int j = n-1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        
    }
}
