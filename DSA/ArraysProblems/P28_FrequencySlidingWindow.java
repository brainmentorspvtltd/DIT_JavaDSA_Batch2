package ArraysProblems;

public class P28_FrequencySlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1,2,3,1};
        int k = 3;
        int x = 2;
        int freq = 0;
        for(int i = 0; i < k; i++) {
            if(arr[i] == x) {
                freq++;
            }
        }
        System.out.println("Frequency is : "+ freq);
        for(int i = k; i < arr.length; i++) {
            int kickOutElement = arr[i-k];
            if(kickOutElement == x) {
                freq--;
            }
            int newElement = arr[i];
            if(newElement == x) {
                freq++;
            }
            System.out.println("Frequency is : " + freq);
        }
    }
}
