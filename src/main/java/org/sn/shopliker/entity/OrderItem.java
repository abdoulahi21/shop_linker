package org.sn.shopliker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "details_commande")
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;
    private Integer quantity;
    private double price;
}
