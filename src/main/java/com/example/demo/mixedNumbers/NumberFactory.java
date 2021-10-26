package com.example.demo.mixedNumbers;

public class NumberFactory {
    public static Number getNumberType(String num){
        if(num == null){
            return null;
        }
        if(PlainNumber.isValid(num)){
            return new PlainNumber(num);

        } else if(HexadecimalNumber.isValid(num)){
            return new HexadecimalNumber(num);

        } else if(Fraction.isValid(num)){
            return new Fraction(num);
        }

        return null;
    }
}
