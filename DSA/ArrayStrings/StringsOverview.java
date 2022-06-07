package ArrayStrings;

public class StringsOverview {
    public static void main(String[] args) {
        String str = "Hello";
        String str_1 = str;
        System.out.println(str.equals(str_1));
        System.out.println(str == str_1);

        // String str_2 = new String("Hello");
        String str_2 = new String("Hello").intern();
        System.out.println(str_2.equals(str));
        System.out.println(str_2 == str);

        // by default it create 16 size of array
        // StringBuffer sb_1 = new StringBuffer();
        // System.out.println(sb.capacity() + "," + sb.length());
        // sb.append("Hello...");
        // System.out.println(sb.capacity() + "," + sb.length());
        // sb.append("How are you ?");
        // System.out.println(sb.capacity() + "," + sb.length());
        // after a particular length it will make length = capacity

        // StringBuilder is faster than StringBuffer
        StringBuilder sb = new StringBuilder();
    }
}
