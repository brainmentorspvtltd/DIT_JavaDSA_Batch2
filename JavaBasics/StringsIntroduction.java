package JavaBasics;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        // String name = scanner.next();       // it will take input before space
        String name = scanner.nextLine();      // it takes input until we press enter

        // String firstchar = name.substring(0, 1);
        // firstchar = firstchar.toUpperCase();
        // String remainingString = name.substring(1).toLowerCase();
        // name = firstchar + remainingString;

        // char e = name.charAt(0);        // fetch character at 0th index
        // String firstchar = String.valueOf(e);   // convert char to String
        // firstchar = firstchar.toUpperCase();    // change String to upper case
        // String remainingString = name.substring(1).toLowerCase();
        // name = firstchar + remainingString;

        // Short Alternative
        // name = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();

        String names[] = name.split(" ");
        String fullName = "";

        for(String n : names) {
            n = String.valueOf(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase();
            fullName += n + " ";
        }

        System.out.println("Welcome : " + fullName);

        scanner.close();
    }    
}
