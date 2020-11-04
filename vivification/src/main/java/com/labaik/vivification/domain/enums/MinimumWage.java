package com.labaik.vivification.domain.enums;

public enum MinimumWage {
    oneMilions(1000000),towMilions(2000000);
    private double value;

    MinimumWage(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
