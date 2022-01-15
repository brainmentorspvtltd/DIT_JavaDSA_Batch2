package JavaBasics;

import java.util.Scanner;

public class TakingInput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your id : ");
        int id = scanner.nextInt();
        System.out.println("Id is : " + id);

        scanner.nextLine();     // it will eat \n coming from above code

        System.out.println("Enter your name : ");
        // String name = scanner.next();       // it will take input before space
        String name = scanner.nextLine();      // it takes input until we press enter
        System.out.println("Welcome : " + name);

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Age is : " + age);

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();
        System.out.println("Salary is : " + salary);

        scanner.close();
    }
}
