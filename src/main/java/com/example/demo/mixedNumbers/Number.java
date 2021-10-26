package com.example.demo.mixedNumbers;

public  class Number {

    private Float value;
    private String originalForm;

    public  Float calculateValue() {
        return (float)0.0;
    };

    @Override
    public String toString() {
        return "AbstractNumber{" +
                "value=" + value +
                ", originalForm='" + originalForm + '\'' +
                '}';
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getOriginalForm() {
        return originalForm;
    }

    public void setOriginalForm(String originalForm) {
        this.originalForm = originalForm;
    }

}
