package com.company.galactech.finalproject.enums;

public enum Repair {
    VURUGU_YOXDUR("Vuruğu yoxdur"),
    RENGLENMEYIB("Rənglənməyib"),
    VURUGU_YOXDUR_VE_RENGLENMEYIB("Vuruğu yoxdur,rənglənməyib"),
    VURUGU_VAR("Vuruğu var"),
    RENGLENIB("Rənglənib"),
    VURUGU_VAR_VE_RENGELENIB("Vuruğu var,rənglənib");


    private String value;

    Repair(){}
    Repair(final String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
