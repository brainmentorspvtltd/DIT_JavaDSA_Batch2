package ArraysProblems;

public class P13_OddElement {

    // Approach_1 - Hashing
    void approach_1(int arr[], int n) {
        int hash[] = new int[100];
        for(int i = 0; i < n; i++) {
            hash[arr[i]] = ++hash[arr[i]];
        }
        for(int i = 0; i < hash.length; i++) {
            if(hash[i] == 1) {
                System.out.println("Element is : " + i);
                break;
            }
        }
    }

    // Approach_1 - XOR
    void approach_2(int arr[], int n) {
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println("Elements is : " + ans);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
    }
}
