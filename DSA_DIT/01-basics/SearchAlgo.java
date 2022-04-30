public class SearchAlgo {
    public static void main(String[] args) {
        int arr[] = {12,2,45,23,4,6,1};
        int search = 12;

        // Base Case
        if(arr.length == 0) {
            System.out.println("Array is empty...");
            return;
        }

        if(arr[0] == search) {
            System.out.println("Found at 0th index...");
            return;
        }

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == search) {
                System.out.println("Found...");
                return;
            }
        }
        System.out.println("Not found...");
    }
}
