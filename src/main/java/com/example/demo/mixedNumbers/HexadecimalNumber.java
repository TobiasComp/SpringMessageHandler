package com.example.demo.mixedNumbers;

public class HexadecimalNumber extends Number {

    public HexadecimalNumber(String num) {
        this.setOriginalForm(num);
        this.setValue(this.calculateValue());
    }

    @Override
    public Float calculateValue() {
        return (float)Long.parseLong(this.getOriginalForm(), 16);
    }

    public static boolean isValid(String num) {
        try
        {
            long hex = Long.parseLong(num,16);
            if ( hex < 0) {
                return false;
            }

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
        }
}
