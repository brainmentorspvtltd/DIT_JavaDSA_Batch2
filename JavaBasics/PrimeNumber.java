package JavaBasics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        boolean prime = true;
        // Check whether the number is divisible by any other number
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                prime = false;
                // System.out.println("Not a prime number...");
                break;
            }
            else {
                // System.out.println("It is a prime number...");
                prime = true;
            }
        }

        if(prime) {
            System.out.println("It's a prime number...");
        }
        else {
            System.out.println("It's not a prime number...");
        }

        scanner.close();

    }
}
