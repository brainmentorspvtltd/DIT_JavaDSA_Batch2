package Arrays2D;

public class P1_2DArrayIntro {
    public static void main(String[] args) {
        // Ways to define 2D Array in Java
        // int x1[][] = new int[3][3];
        // int [][]x2 = new int[3][3];
        // int []x3[] = new int[3][3];
        // int x4[][] = new int[3][];
        // int x5[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        int x[][] = {{2,1,4,6}, {3,4,6,6},{1,4,7,8}, {2,2,5,7}};
        int row_size = x.length;
        int col_size = x[0].length;

        // Row Major
        for(int i = 0; i < row_size; i++) {
            for(int j = 0; j < col_size; j++) {
                System.out.print(x[i][j] + ",");
            }
            System.out.println();
        }

        System.out.println("==========================");

        // Col Major
        for(int i = 0; i < row_size; i++) {
            for(int j = 0; j < col_size; j++) {
                System.out.print(x[j][i] + ",");
            }
            System.out.println();
        }
    }
}
