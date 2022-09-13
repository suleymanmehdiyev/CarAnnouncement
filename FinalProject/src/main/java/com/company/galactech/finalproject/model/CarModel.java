package com.company.galactech.finalproject.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "car_model")
public class CarModel implements Serializable {
    private static final long serialVersionUID = 7227240053921243770L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "model_sequence")
    @SequenceGenerator(name = "model_sequence",allocationSize = 1,initialValue =1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "model_name", nullable = false)
    private String modelName;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "brand_id")
    private CarBrand brand;

    public CarModel(Integer id) {
        this.id = id;
    }
}