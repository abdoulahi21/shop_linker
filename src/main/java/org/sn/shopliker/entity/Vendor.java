package org.sn.shopliker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

@Table(name = "vendeur")
public class Vendor {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private User user;

    private String shopName;
    private String description;
    private String status;

    @ManyToOne
    private Subscription subscription;
}
