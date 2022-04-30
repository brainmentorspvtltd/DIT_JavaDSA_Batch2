public class SpaceComplexity {
// Reverse an array
    // Approach 1:
    // Take an empty array and start storing the elements from last
    // TC : O(n), SC : O(n)
    void approach_1() {
        int arr[] = {1,2,3,4,5};
        int aux[] = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            aux[j] = arr[i];
        }
        arr = aux;
        for(int e : arr) {
            System.out.println(e + ",");
        }
    }

    // Approach 2 : Using Two Pointers
    // TC : O(n), SC : O(1)
    void approach_2() {
        int arr[] = {1,2,3,4,5};
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int e : arr) {
            System.out.println(e + ",");
        }
    }
    public static void main(String[] args) {

    }    
}
