package practiced;

import java.util.*;
import java.math.BigInteger;

public class Assi1 {

    public static BigInteger square(BigInteger x) {
        if (x.compareTo(BigInteger.TEN) < 0) {
            return x.multiply(x);
        }

        int Y = x.toString().length();
        int halfn = Y / 2;

        BigInteger a = x.divide(BigInteger.TEN.pow(halfn));
        BigInteger b = x.mod(BigInteger.TEN.pow(halfn));

        BigInteger ac = square(a);
        BigInteger bd = square(b);
        BigInteger aplusb = square(a.add(b)).subtract(ac).subtract(bd);

        BigInteger result = ac.multiply(BigInteger.TEN.pow(2 * halfn))
                .add(aplusb.multiply(BigInteger.TEN.pow(halfn))).add(bd);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();

        BigInteger result = square(x);

        System.out.println("Square of the number is: " + result);
    }
}

