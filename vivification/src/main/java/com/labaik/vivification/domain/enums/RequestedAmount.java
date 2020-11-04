package com.labaik.vivification.domain.enums;

public enum RequestedAmount {
    one(50000),two(100000),three(150000),four(200000),five(250000);
    private  int value;

    public int getValue() {
        return value;
    }

    RequestedAmount(int value) {
        this.value = value;
    }
}
