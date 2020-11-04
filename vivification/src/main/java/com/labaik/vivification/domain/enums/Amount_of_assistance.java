package com.labaik.vivification.domain.enums;

public enum Amount_of_assistance {
    one(1000000),tow(2000000);
    private int value;

    Amount_of_assistance(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
