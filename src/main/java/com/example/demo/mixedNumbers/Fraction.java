package com.example.demo.mixedNumbers;

public class Fraction extends Number {
    private int upper;
    private int lower;

    public Fraction(String num) {
        int slash = num.indexOf('/');
        this.upper = Integer.parseInt(num.substring(0, slash));
        this.lower = Integer.parseInt(num.substring(slash+1, num.length()));
        this.setOriginalForm(num);
        this.setValue(this.calculateValue());
    }

    @Override
    public Float calculateValue() {
        return ((float)upper/lower);
    }

    public static boolean isValid(String num) {
        int slash = num.indexOf('/');
        if ( slash == -1 ) {
            return false;
        }
        String upper = num.substring(0, slash);
        String lower = num.substring(slash+1, num.length());
        if ( upper.charAt(0) == '-' && lower.charAt(0) == '-') {
            upper = upper.substring(1);
            lower = lower.substring(1);
        }
        if ( Integer.parseInt(lower.substring(lower.length()-1))==0) {
            return false;
        }

        return isPlainOrHex(upper) && isPlainOrHex(lower);
    }

    public static boolean isPlainOrHex(String num) {
        return PlainNumber.isValid(num) || HexadecimalNumber.isValid(num);
    }

}
