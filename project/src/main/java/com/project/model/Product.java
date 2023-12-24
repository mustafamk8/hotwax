package com.project.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "PRODUCT_ID", length = 40, nullable = false)
    private String productId;

    @Column(name = "OWNER_PARTY_ID", length = 40)
    private String ownerPartyId;

    @Column(name = "PRODUCT_NAME", length = 255)
    private String productName;

    @Column(name = "DESCRIPTION", length = 4095)
    private String description;

    @Column(name = "CHARGE_SHIPPING", length = 1)
    private char chargeShipping;

    @Column(name = "RETURNABLE", length = 1)
    private char returnable;

    @ManyToOne
    @JoinColumn(name = "OWNER_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    private Party ownerParty;

    // Constructors, getters, and setters

    // Rest of the code...
}
