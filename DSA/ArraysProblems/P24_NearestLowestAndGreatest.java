package ArraysProblems;

public class P24_NearestLowestAndGreatest {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int search = 72;
        int low = 0;
        int mid = 0;
        int nearestLowest = 0;
        int nearestGreatest = 0;
        int high = arr.length - 1;
        // TC : O(logn)
        for(int i = 0; i < arr.length; i++) {
            mid = (low + high) / 2;
            if(search > arr[mid]) {
                low = mid + 1;  // left to right
                nearestLowest = arr[mid];
            }
            else if(search < arr[mid]) {
                high = mid - 1; // right to left
                nearestGreatest = arr[mid];
            }
            else {
                nearestGreatest = nearestLowest = arr[mid];
                break;
            }
        }
        System.out.println("Lowest : " + nearestLowest + ", Greatest : " + nearestGreatest);
    }
}
