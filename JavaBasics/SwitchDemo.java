package JavaBasics;

public class SwitchDemo {
    public static void main(String[] args) {
        
        int x = 10;
        // expression of switch - int, long, short, byte, strings
        switch (x) {
            case 2:
                System.out.println("Number was 2...");
                break;
            case 4:
                System.out.println("Number was 4...");
                break;
            case 6:
                System.out.println("Number was 6...");
                break;
            case 8:
                System.out.println("Number was 8...");
                break;
            case 10:
                System.out.println("Number was 10...");
                break;
        
            default:
                System.out.println("Unknown number....");
                break;
        }
    }
}
