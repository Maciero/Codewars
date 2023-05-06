package org.Codewars.kyu5;

import java.math.BigInteger;

public class RectangleFibonacciSequence {
    public static BigInteger perimeter(BigInteger n) {

        BigInteger nBig = n.add(BigInteger.valueOf(1));

        if (nBig.equals(0) || nBig.equals(1)) {
            return n;
        }

        BigInteger n0 = BigInteger.valueOf(0), n1 = BigInteger.valueOf(1);
        BigInteger tempNthTerm;

        BigInteger sum = BigInteger.ZERO;

        for (BigInteger bi = BigInteger.valueOf(1); bi.compareTo(nBig) <= 0; bi = bi.add(BigInteger.ONE)) {
            tempNthTerm = n0.add(n1);
            n0 = n1;
            n1 = tempNthTerm;
            sum = sum.add(n0);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}
//BigInteger a = BigInteger.ZERO;
//    BigInteger b = BigInteger.ONE;
//    BigInteger c = BigInteger.ONE;
//    BigInteger sum = BigInteger.ZERO;
//
//    for(int i = 0; i <= n.intValue(); i++) {
//      a = b;
//      b = c;
//      c = a.add(b);
//      sum = sum.add(a);
//    }
//
//    return sum.multiply(BigInteger.valueOf(4));
//	}