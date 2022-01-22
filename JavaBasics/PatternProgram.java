package JavaBasics;

public class PatternProgram {
    public static void main(String[] args) {
        // *****
        // *****
        // *****
        // *****
        // *****
        // for(int i = 0; i < 5; i++) {
        //     for(int j = 0; j < 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // *
        // **
        // ***
        // ****
        // *****
        // for(int i = 0; i < 5; i++) {
        //     for(int j = 0; j < i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // int n = 5;
        // for(int i = 0; i < n; i++) {
        //     for(int j = n-1; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 101010
        // 101010
        // 101010
        // 101010
        // 101010
        // for(int i = 0; i < 5; i++) {
        //     for(int j = 0; j < 5; j++) {
        //         // System.out.println("Debug : "+j % 2);
        //         if(j % 2 == 0) {
        //             System.out.print("0");
        //         }
        //         else {
        //             System.out.print("1");
        //         }
                
        //     }
        //     System.out.println();
        // }


        //    1
        //   2 3
        //  4 5 6
        // 7 8 9 10
        // int n = 4;
        // int k = 0;
        // for(int i = 0; i < n; i++) {
        //     for(int j = n-1; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j <= i; j++) {
        //         k += 1;
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }

        //      *
        //     * *
        //    *   * 
        //   *     *
        //  *       *
        // ***********
        // int n = 5;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     if(i == 1 || i == n) {
        //         for(int j = 1; j <= i*2 - 1; j++) {
        //             System.out.print("*");
        //         }
        //     }
        //     else {
        //         for(int j = 1; j <= i*2 - 1; j++) {
        //             if(j == 1 || j == i * 2 - 1) {
        //                 System.out.print("*");
        //             }
        //             else {
        //                 System.out.print(" ");
        //             }
                    
        //         }
        //     }
            
        //     System.out.println();
        // }


    // Pascal Triangle
    //         1
    //        1 1
    //       1 2 1
    //      1 3 3 1
    //     1 4 6 4 1
    //    1 5 10 10 5 1
    int n = 6;
    int x = 1;
    for(int i = 0; i < n; i++) {
        for(int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }

        for(int j = 0; j <=i; j++) {
            if(j == 0 || i == 0) {
                x = 1;
            }
            else {
                x = x * (i - j + 1) / j;
            }
            System.out.print(x + " ");
        }
        System.out.println();
    }


    }
}
