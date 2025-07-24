package org.sn.shopliker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "inscription")
public class Subscription {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private Integer durationDays;
    private String features;
}