package ArraysProblems;

public class P27_SubArrayGivenSum {
    static void approach_1(int arr[], int sum) {
        for(int i = 0; i < arr.length-1; i++) {
            int total = 0;
            for(int j = i+1; j < arr.length; j++) {
                total += arr[j];
                if(total == sum) {
                    System.out.println("Sum Found...");
                    return;
                }
            }
        }
        System.out.println("Not found...");
    }

    // Using window sliding
    static void approach_2(int arr[], int sum) {
        int startIndex = 0;
        int slideSum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            while(slideSum > sum && startIndex < i - 1) {
                slideSum = slideSum - arr[startIndex];
                startIndex++;
            }
            if(slideSum == sum) {
                System.out.println("Sum Found...");
                return;
            }
            if(i < arr.length) {
                slideSum += arr[i];
            }
        }
        if(slideSum == sum) {
            System.out.println("Sum found...");
            return;
        }
        System.out.println("No Such Sum Found...");
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,90,290};
        int sum = 160;
        approach_2(arr, sum);
    }

}
