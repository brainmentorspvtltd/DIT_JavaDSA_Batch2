package JavaBasics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaDataTypes {
    public static strictfp void main(String[] args) {
        // For Integer
        byte x = 12;
        short x1 = 10;
        int x2 = 10;
        long z = 10;
        
        // For decimal
        float y = 10.4f;
        double z1 = 10.4;


        BigInteger a = new BigInteger("6768768678768");
        BigInteger b = new BigInteger("9878798798999");
        BigInteger c = a.add(b);
        System.out.println(c);

        BigDecimal a1 = new BigDecimal("0.8998");
        BigDecimal a2 = new BigDecimal("0.899889898");
        BigDecimal a3 = a1.add(a2);
        System.out.println(a3);

    }
}
