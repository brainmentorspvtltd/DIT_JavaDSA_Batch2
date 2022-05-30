package ArraysProblems;

import java.util.Arrays;

public class P2_MaxElementInArray {
    
    // TC : O(n^2)
    static void approach_1(int arr[], int n) {
        boolean isMax;
        for(int i = 0; i < n; i++) {
            isMax = true;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax) {
                System.out.println("Largest : " + arr[i]);
                return;
            }
        }
    }

    // TC : O(n)
    static void approach_2(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element is : " + max);
    }

    // TC : O(n)
    static void approach_3(int arr[], int n) {
        Arrays.sort(arr);
        int max = arr[n-1];
        System.out.println("Largest Element is :" + max);
    }

    public static void main(String[] args) {
        int arr[] = {20,30,40,90,70,6};
        int n = arr.length;
        approach_1(arr, n);
    }

}
