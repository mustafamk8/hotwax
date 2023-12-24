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
@Table(name = "Party")
public class Party {
    @Id
    @Column(name = "PARTY_ID", length = 40, nullable = false)
    private String partyId;

    @Column(name = "PARTY_TYPE_ENUM_ID", length = 40)
    private String partyTypeEnumId;

    // Getters and setters

    
    
    // Rest of the code...
}
