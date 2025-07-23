package org.sn.shopliker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
public class Subscription {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private Integer durationDays;
    private String features;
}