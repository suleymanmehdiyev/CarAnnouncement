package com.company.galactech.finalproject.enums;

public enum SalesType {
    KREDIT("Kredit"),
    BARTER("Barter"),
    KREDIT_BARTER("Kredit,barter"),
    NULL("null");

    private final String value;

    SalesType(final String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
