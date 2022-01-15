package JavaBasics;

import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name");
        // int name = System.in.read();    // read one byte at a time, and store ASCII
        // System.out.println(name);
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        scanner.close();
    }
}
