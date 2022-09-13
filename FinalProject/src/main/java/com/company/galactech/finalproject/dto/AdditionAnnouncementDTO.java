package com.company.galactech.finalproject.dto;

import com.company.galactech.finalproject.model.BaseAnnouncement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdditionAnnouncementDTO {
//    BaseAnnouncementDTO baseAnnouncement;
    String name;
    String phoneNumber;
    String color;
    String fuel_type;
    String transmitter;
    String gearbox;
    Integer volume;
    Integer power;
    String vendor;
    String owners_number;
    String seats_number;
    String repair;
    String market_address;
    String vehicle_equip;
    LocalDateTime announce_date;
    String description;
    BaseAnnouncementDTO baseAnnouncement;

    public AdditionAnnouncementDTO(BaseAnnouncement addAnnounce) {
        this.baseAnnouncement = new BaseAnnouncementDTO(addAnnounce);
        this.name = addAnnounce.getUser().getUserName();
        this.phoneNumber = addAnnounce.getUser().getPhoneNumber();
        this.color = addAnnounce.getAddAnnounce().getColor();
        this.fuel_type = addAnnounce.getAddAnnounce().getFuel().getValue();
        this.transmitter = addAnnounce.getAddAnnounce().getTransmitter().getValue();
        this.gearbox = addAnnounce.getAddAnnounce().getGearbox().getValue();
        this.volume = addAnnounce.getAddAnnounce().getVolume();
        this.power = addAnnounce.getAddAnnounce().getVolume();
        this.vendor = addAnnounce.getAddAnnounce().getVendor().getValue();
        this.owners_number = addAnnounce.getAddAnnounce().getOwnersNumber().getValue();
        this.seats_number = addAnnounce.getAddAnnounce().getSeatsNumber().getValue();
        this.repair = addAnnounce.getAddAnnounce().getRepair().getValue();
        this.market_address = addAnnounce.getAddAnnounce().getMarketAddress().getValue();
        this.vehicle_equip = addAnnounce.getAddAnnounce().getVehicleEquip();
        this.announce_date = addAnnounce.getAddAnnounce().getAnnounceDate();
        this.description = addAnnounce.getAddAnnounce().getDescription();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getColor() {
        return color;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public String getTransmitter() {
        return transmitter;
    }

    public String getGearbox() {
        return gearbox;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getPower() {
        return power;
    }

    public String getVendor() {
        return vendor;
    }

    public String getOwners_number() {
        return owners_number;
    }

    public String getSeats_number() {
        return seats_number;
    }

    public String getRepair() {
        return repair;
    }

    public String getMarket_address() {
        return market_address;
    }

    public String getVehicle_equip() {
        return vehicle_equip;
    }

    public LocalDateTime getAnnounce_date() {
        return announce_date;
    }

    public String getDescription() {
        return description;
    }

    public BaseAnnouncementDTO getBaseAnnouncement() {
        return baseAnnouncement;
    }
}
