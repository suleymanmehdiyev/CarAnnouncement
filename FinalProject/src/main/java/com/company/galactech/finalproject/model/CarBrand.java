package com.company.galactech.finalproject.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "car_brand")
public class CarBrand implements Serializable {
    private static final long serialVersionUID = -3530199893120972876L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "brand_sequence")
    @SequenceGenerator(name = "brand_sequence",allocationSize = 1,initialValue =1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "brand_name", nullable = false)
    private String brandName;

    public CarBrand(Integer id) {
        this.id = id;
    }
}