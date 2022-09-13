package com.company.galactech.finalproject.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "account")
public class Account implements Serializable {
    private static final long serialVersionUID = -1219388867354131672L;
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "balance",columnDefinition = "decimal(10,2) default '0.00'")
    private Double balance;

    @Column(name = "vip",columnDefinition = "boolean default 'false'")
    private Boolean vip;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id")
    private User user;


}