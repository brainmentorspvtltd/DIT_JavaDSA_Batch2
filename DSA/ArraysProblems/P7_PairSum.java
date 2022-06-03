package ArraysProblems;

import java.util.Arrays;
import java.util.HashMap;

public class P7_PairSum {

    static void approach_1(int arr[], int n, int k) {
        int sum = 0;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                if(sum == k) {
                    System.out.println("Pair is : " + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }

    // Using HashMap / HashTable
    // TC : 0(n), SC : 0(n)
    static void approach_2(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr) {
            if(map.get(element) == null) {
                map.put(k - element, element);
            }
            else {
                System.out.println("Pair Sum Found..." + map.get(element) + "," + element);
            }
        }
    }

    // Using Two Pointer Approach
    void approach_3(int arr[], int n, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        while(i < j) {
            if(arr[i] + arr[j] == k) {
                System.out.println("Pair is : " + arr[i] + "," + arr[j]);
            }
            else if(arr[i] + arr[j] < k) {
                i++;
            }
            else if(arr[i] + arr[j] > k) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,5};
        int n = arr.length;
        int k = 9;
        approach_1(arr, n, k);
    }
}
