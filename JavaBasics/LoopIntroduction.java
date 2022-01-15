package JavaBasics;

import java.util.Scanner;

public class LoopIntroduction {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        // for(int i = 1; i < 11; i++) {
        //     System.out.println(num * i);
        // }

        int i = 1;
        while(i < 11) {
            System.out.println(num * i);
            i++;
        }

        scanner.close();

    }
}
