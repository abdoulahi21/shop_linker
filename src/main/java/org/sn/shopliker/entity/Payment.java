package org.sn.shopliker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Order order;
    private String paymentMethod;
    private double amount;
    private String status;
    private LocalDateTime paymentDate;
}
