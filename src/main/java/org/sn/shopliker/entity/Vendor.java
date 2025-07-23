package org.sn.shopliker.entity;

import jakarta.persistence.*;

@Entity
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
