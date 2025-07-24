package org.sn.shopliker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "produit")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Vendor vendor;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String name;
    private String description;
    private double price;
    private Integer stock;
    private String image;
}
