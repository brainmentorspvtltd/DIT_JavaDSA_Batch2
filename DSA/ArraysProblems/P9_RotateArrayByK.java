package ArraysProblems;

public class P9_RotateArrayByK {
    static void approach_1(int arr[], int n, int k) {
        for(int j = 1; j <= k; j++) {
            int x = arr[n-1];
            for(int i = n - 1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = x;
        }

        System.out.println("Array After Rotation...");
        for(int i : arr) {
            System.out.print(i + ",");
        }
    }

    static void approach_2(int arr[], int n, int k) {
        int temp[] = new int[n];
        for(int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        System.out.println("Array After Rotation...");
        for(int i : arr) {
            System.out.print(i + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        approach_1(arr, n, k);
    }
}
