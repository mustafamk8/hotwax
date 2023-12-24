package com.project.model;

import org.hibernate.annotations.GenericGenerator;

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
@Table(name = "Party")

public class Party {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
    strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "PARTY_ID", length = 40, nullable = false)
    private String partyId;

    @Column(name = "PARTY_TYPE_ENUM_ID", length = 40)
    private String partyTypeEnumId;

    @OneToOne(mappedBy = "party")
    private Person person;

    public Party() {
        // Default constructor
    }

    // Getters and setters...

    // Rest of the code...
}
