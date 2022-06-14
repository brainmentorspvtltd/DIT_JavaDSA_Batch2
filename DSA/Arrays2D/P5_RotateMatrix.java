package Arrays2D;

public class P5_RotateMatrix {
    void rotate(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int []b : a) {
            for(int i = 0, j = a.length - 1; i < a.length/2; i++,j--) {
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
