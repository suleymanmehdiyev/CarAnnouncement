package com.company.galactech.finalproject.model;

import com.company.galactech.finalproject.enums.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "addition_announcement")
public class AdditionAnnouncement implements Serializable {
    private static final long serialVersionUID = -782632580554133153L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "addition_sequence")
    @SequenceGenerator(name = "addition_sequence",allocationSize = 1,initialValue =1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "announce_date")
    private LocalDateTime announceDate;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "description")
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "engine", nullable = false)
    private String engine;

    @Column(name = "engine_power", nullable = false)
    private Integer enginePower;

    @Column(name = "fuel", nullable = false)
    private FuelType fuel;

    @Column(name = "gearbox", nullable = false)
    private Gearbox gearbox;

    @Column(name = "market_address", length = 32)
    private MarketAddresses marketAddress;

    @Column(name = "mileage", nullable = false)
    private Integer mileage;

    @Column(name = "mileage_type", length = 32,columnDefinition = "varchar(32) default 'KM'")
    private MileageType mileageType;

    @Column(name = "owners_number", length = 32)
    private OwnersNumber ownersNumber;

    @Column(name = "repair", length = 50,columnDefinition = "varchar(60) default 'VURUGU_YOXDUR_VE_RENGLENMEYIB'")
    private Repair repair;

    @Column(name = "seats_number", nullable = false)
    private SeatsNumber seatsNumber;

    @Column(name = "transmitter", nullable = false)
    private Transmitter transmitter;

    @Column(name = "vehicle_equip")
    @Type(type = "org.hibernate.type.TextType")
    private String vehicleEquip;

    @Column(name = "vendor", length = 32,columnDefinition = "varchar(32) default 'SEXSI'")
    private VendorType vendor;

    @Column(name = "volume", nullable = false)
    private Integer volume;



}