package programmers;

import java.math.BigDecimal;
import java.math.BigInteger;

// 두수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/181846
public class Level00_두수의합 {

    public static void main(String[] args) {
        System.out.println(solution01("582", "734")); // "1316"
        System.out.println(solution01("18446744073709551615", "287346502836570928366")); // "305793246910280479981"
        System.out.println(solution01("58244", "734")); // "58987"
        System.out.println(solution01("0", "0")); // "0"
    }

    public static String solution01(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger add = aa.add(bb);
        return add.toString();
    }

    public static String solution(String a, String b) {
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        BigDecimal add = aa.add(bb);
        return add.toString();
    }

}

