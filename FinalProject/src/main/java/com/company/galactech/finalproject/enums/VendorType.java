package com.company.galactech.finalproject.enums;

public enum VendorType {
    HAMISI("Hamısı"),
    AVTOSALONLAR("Avtosalonlar"),
    SEXSI("Şəxsi");
    private final String value;

    VendorType(final String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
