package org.sn.shopliker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Vendor vendor;
    @ManyToOne
    private Category category;
    private String name;
    private String description;
    private double price;
    private Integer stock;
    private String image;
}
