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
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "PARTY_ID", length = 40, nullable = false)
    private String partyId;

    @Column(name = "SALUTATION", length = 255)
    private String salutation;

    @Column(name = "FIRST_NAME", length = 255)
    private String firstName;

    @Column(name = "MIDDLE_NAME", length = 255)
    private String middleName;

    @Column(name = "LAST_NAME", length = 255)
    private String lastName;

    @Column(name = "GENDER", length = 1)
    private String gender;

    @Column(name = "BIRTH_DATE")
    private String birthDate;

    @Column(name = "MARITAL_STATUS_ENUM_ID", length = 40)
    private String maritalStatusEnumId;

    @Column(name = "EMPLOYMENT_STATUS_ENUM_ID", length = 40)
    private String employmentStatusEnumId;

    @Column(name = "OCCUPATION", length = 255)
    private String occupation;

    @OneToOne
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    private Party party;

    public Person() {
        // Default constructor
    }

    // Getters and setters...

    // Rest of the code...
}
