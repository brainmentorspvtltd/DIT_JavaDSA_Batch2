package Arrays2D;

import java.util.ArrayList;
import java.util.List;

public class P8_PascalTriangle {
    static List<List<Integer>> pascal(int rows) {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        tri.add(new ArrayList<>());
        tri.get(0).add(1);

        // System.out.println(tri);

        for(int i = 1; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = tri.get(i - 1);
            // First element of row is always 1
            row.add(1);

            for(int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // Last element of row is always 1
            row.add(1);
            tri.add(row);
        }
        return tri;
    }

    public static void main(String[] args) {
        List<List<Integer>> tri = pascal(5);
        System.out.println(tri);
    }
}
