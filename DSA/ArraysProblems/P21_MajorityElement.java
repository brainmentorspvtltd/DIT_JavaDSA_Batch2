package ArraysProblems;

public class P21_MajorityElement {
    int approach_1(int arr[], int n) {
        int majorityCount = n / 2;
        for(int num : arr) {
            int count = 0;
            for(int elem : arr) {
                if(elem == num) {
                    count += 1;
                }
            }
            if(count > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    // Using HashMap
    void approach_2() {

    }

    // Boyer Moore Algorithm
    void approach_3(int arr[], int n) {
        int count = 0;
        int majorityElement = 0;
        /*
         *  Logic is : 
         * - we maintain a count
         * - count is incremented whenever we see an instance of our array
         * current element is equal to majority element
         * - else we decrement the count
         */
        for(int i = 0; i < n; i++) {
            /*
             * Whenever count equals to zero, we make a new majoriry Element
             */
            if(count == 0) {
                majorityElement = arr[i];
            }
            if(majorityElement == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == majorityElement) {
                count++;
            }
        }
        String msg = count > n/2 ? "Majority Element" : "Not Majority Element";
        System.out.println(msg);
    }

}
