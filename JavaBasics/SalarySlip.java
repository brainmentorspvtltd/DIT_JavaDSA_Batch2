package JavaBasics;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your id : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        String names[] = name.split(" ");
        String fullName = "";

        for(String n : names) {
            n = String.valueOf(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase();
            fullName += n + " ";
        }

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        // Localization
        Locale locale = new Locale("en","US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatSalary = nf.format(salary);

        Date date = new Date();
        System.out.println("Orignal Date : " + date);

        // style - DateFormat.SHORT, DateFormat.LONG
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String formattedDate = df.format(date);
        System.out.println("Formatted Date : " + formattedDate);
        
        System.out.println("Id is : " + id);
        System.out.println("Welcome : " + fullName);
        System.out.println("Age is : " + age);
        
        System.out.println("Salary is : " + formatSalary);

        scanner.close();
    }
}
