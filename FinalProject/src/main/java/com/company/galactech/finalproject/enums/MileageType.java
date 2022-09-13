package com.company.galactech.finalproject.enums;

public enum MileageType {
    KM("km"),
    MI("mi");

    private final String value;

    MileageType(final String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
