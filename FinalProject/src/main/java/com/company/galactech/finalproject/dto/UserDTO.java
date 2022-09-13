package com.company.galactech.finalproject.dto;

import com.company.galactech.finalproject.model.User;

public class UserDTO {
   private String name;
   private String email;
   private String phoneNumber;
   private String cityName;

    public UserDTO(User u) {
        this.name = u.getUserName();
        this.email = u.getEmail();
        this.phoneNumber = u.getPhoneNumber();
        this.cityName = u.getCity().getCityName();
    }
    public UserDTO(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
