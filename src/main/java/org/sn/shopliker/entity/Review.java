package org.sn.shopliker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "commentaire")
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
    private Integer rating;
    private String comment;
    private LocalDateTime createdAt;
}
