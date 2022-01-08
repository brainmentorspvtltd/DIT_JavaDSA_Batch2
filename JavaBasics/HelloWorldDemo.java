package JavaBasics;

public class HelloWorldDemo {
    public static void main(String[] args) {
        // String firstname = args[0];
        // String lastname = args[1];
        // System.out.println("Hello " + firstname + " " + lastname);

        // int fnum = Integer.parseInt(args[0]);    // type casting
        // int snum = Integer.parseInt(args[1]);
        // int result = fnum + snum;
        // System.out.println("Output is " + result);
        
        // String msg = args[0];
        // System.out.println(msg);
        // System.out.print(msg);

        // if(args.length == 2) {
        //     int fnum = Integer.parseInt(args[0]);
        //     int snum = Integer.parseInt(args[1]);
        //     int result = fnum + snum;
        //     System.out.println("Output is " + result);
        // }
        // else {
        //     System.out.println("Invalid Input...");
        // }
        
        // int sum = 0;
        // for(int i = 0; i < args.length; i++) {
        //     sum += Integer.parseInt(args[i]);
        // }
        
        // Enhanced for loop
        // for(String i : args) {
        //     sum += Integer.parseInt(i);
        // }
        
        // System.out.println("Sum is " + sum);

        // Local variable initialization is must have
        // int w;
        // System.out.println(w);

        // follow camel case naming convention
        String firstName = "Ravi";
        System.out.println(firstName);

        // float w = 10.5f;
        // int w1 = (int) w;   // type casting

        for(String i : args) {
            System.out.print(i + " ");
        }
        
    }
}
