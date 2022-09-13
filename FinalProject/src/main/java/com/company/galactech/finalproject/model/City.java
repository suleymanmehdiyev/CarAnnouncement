package com.company.galactech.finalproject.model;

import lombok.*;

import javax.annotation.sql.DataSourceDefinitions;
import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "city")
public class City implements Serializable {
    private static final long serialVersionUID = -2642817765418638560L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "city_sequence")
    @SequenceGenerator(name = "city_sequence",allocationSize = 1,initialValue =1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    public City(Integer id) {
        this.id = id;
    }
}