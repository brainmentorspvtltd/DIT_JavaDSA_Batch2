package ArraysProblems;

public class P23_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int search = 70;
        int low = 0;
        int mid = 0;
        int i = 0;
        int high = arr.length - 1;
        while(low < high) {
            mid = (low + high) / 2;
            if(search == arr[mid]) {
                System.out.println("Element found...");
                return;
            }
            if(search > arr[mid]) {
                low = mid + 1;  // left to right
            }
            else if(search < arr[mid]) {
                high = mid - 1; // right to left
            }
            i++;
            System.out.println("I is : " + i);
        }
    }
}
