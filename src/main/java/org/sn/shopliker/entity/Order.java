package org.sn.shopliker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "shop_order")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    private String status;
    private double totalPrice;
    private LocalDateTime createdAt;
}
