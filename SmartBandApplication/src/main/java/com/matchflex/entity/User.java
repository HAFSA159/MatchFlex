package com.matchflex.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String phoneNumber;

    @OneToOne(mappedBy = "owner", cascade = CascadeType.ALL)
    private SmartBand smartBand;
}

