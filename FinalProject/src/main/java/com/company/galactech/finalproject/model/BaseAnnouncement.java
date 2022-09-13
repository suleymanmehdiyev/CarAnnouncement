package com.company.galactech.finalproject.model;

import com.company.galactech.finalproject.enums.BanType;
import com.company.galactech.finalproject.enums.CarCondition;
import com.company.galactech.finalproject.enums.Currency;
import com.company.galactech.finalproject.enums.SalesType;
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
@Table(name = "base_announcement")
public class BaseAnnouncement implements Serializable {
    private static final long serialVersionUID = 1908449942270054710L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "base_sequence")
    @SequenceGenerator(name = "base_sequence",allocationSize = 1,initialValue =1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ban_type", nullable = false)
    private BanType banType;

    @Column(name = "currency", nullable = false,columnDefinition = "varchar(32) default 'AZN'")
    private Currency currency;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "sales_type",columnDefinition = "varchar(32) default 'NULL'")
    private SalesType salesType;

    @Column(name = "search_control")
    private CarCondition searchControl;

    @Column(name = "year_car", nullable = false)
    private Integer yearCar;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "add_announce_id")
    private AdditionAnnouncement addAnnounce;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "brand_id")
    private CarBrand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "model_id")
    private CarModel model;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id")
    private User user;


}