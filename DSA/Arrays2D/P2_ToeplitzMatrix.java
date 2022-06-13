package Arrays2D;

public class P2_ToeplitzMatrix {
    static boolean isToePlitz(int [][]arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[i+1][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,6,7,7}, {3,2,5,7}, {4,5,6,32}};
        System.out.println(isToePlitz(arr));
    }
}
