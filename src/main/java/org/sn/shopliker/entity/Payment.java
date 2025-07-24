package org.sn.shopliker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "payement")
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
