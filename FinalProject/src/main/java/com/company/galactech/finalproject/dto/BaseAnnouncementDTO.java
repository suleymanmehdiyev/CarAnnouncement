package com.company.galactech.finalproject.dto;

import com.company.galactech.finalproject.model.BaseAnnouncement;

import java.time.LocalDateTime;

public class BaseAnnouncementDTO {
    Double price;
    String currency;
    String car_brand;
    String car_model;
    Integer year;
    String engine;
    Integer mileage;
    String mileage_type;
    String city;
    LocalDateTime created_time;


    public BaseAnnouncementDTO(BaseAnnouncement b){
        this.price = b.getPrice();
        this.currency = b.getCurrency().name();
        this.car_brand = b.getBrand().getBrandName();
        this.car_model = b.getModel().getModelName();
        this.year = b.getYearCar();
        this.engine = b.getAddAnnounce().getEngine();
        this.mileage = b.getAddAnnounce().getMileage();
        this.mileage_type = b.getAddAnnounce().getMileageType().getValue();
        this.city = b.getUser().getCity().getCityName();
        this.created_time = b.getAddAnnounce().getAnnounceDate();
    }

    public Double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public Integer getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public Integer getMileage() {
        return mileage;
    }

    public String getMileage_type() {
        return mileage_type;
    }

    public String getCity() {
        return city;
    }

    public LocalDateTime getCreated_time() {
        return created_time;
    }
}
