package com.company.galactech.finalproject.enums;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum Transmitter {
    ARXA("Arxa"),
    ON("Ön"),
    TAM("Tam");
    private final String value;

    Transmitter(final String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

}
