package com.example.demo.mixedNumbers;

public class PlainNumber extends Number {

    @Override
    public Float calculateValue() {
        return (float)Integer.parseInt(this.getOriginalForm());
    }

    public static boolean isValid(String num) {
        if ( !num.chars().allMatch( Character::isDigit ) )
            return false;
        return true;
    }

    public PlainNumber(String num) {
        this.setOriginalForm(num);
        this.setValue(this.calculateValue());
    }
}
