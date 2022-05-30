package ArraysProblems;

public class P3_SecondMaxElementInArray {

    static void secondLargest_approach_1(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int secondMax = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second Largest : " + secondMax);
    }

    static void secondLargest_approach_2(int arr[], int n) {
        int max = -1;
        int secondMax = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second Largest : " + secondMax);
    }

    public static void main(String[] args) {
        int arr[] = {20,30,40,90,70,6};
        int n = arr.length;
        secondLargest_approach_1(arr, n);
        secondLargest_approach_2(arr, n);
    }
}
