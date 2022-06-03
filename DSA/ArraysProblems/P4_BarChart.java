package ArraysProblems;

public class P4_BarChart {
    public static void main(String[] args) {
        int arr[] = {3,1,0,7,5};
        int n = arr.length;
        int max = arr[0];
        for(int ele : arr) {
            if(ele > max) {
                max = ele;
            }
        }

        // TC : O(n^2)
        for(int i = max; i >= 1; i--) {
            for(int j = 0; j < n; j++) {
                if(i <= arr[j]) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
