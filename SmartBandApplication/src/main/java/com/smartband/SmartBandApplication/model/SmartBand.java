package com.smartband.SmartBandApplication.model;

import com.smartband.SmartBandApplication.model.Enum.BandStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "smart_bands")
public class SmartBand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bandId;

    @Column(unique = true)
    private String serialNumber;

    private LocalDateTime activationTime;

    @Enumerated(EnumType.STRING)
    private BandStatus status;

//    @OneToMany(mappedBy = "smartBand", cascade = CascadeType.ALL)
//    private List<MatchPackage> assignedPackages;
//
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User owner;

    // Constructors
    public SmartBand() {}

    public SmartBand(String serialNumber) {
        this.serialNumber = serialNumber;
        this.status = BandStatus.INACTIVE;
    }
}