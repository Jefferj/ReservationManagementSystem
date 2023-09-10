package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "airlines")
public class AirlineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airline_id")
    private int id;

    @Column(name = "airline_name")
    private String nameAirline;

    @Column(name = "airline_description")
    private String description;

    @Column(name = "airline_code")
    private String codeAirline;

    public AirlineEntity(String nameAirline, String description, String codeAirline) {
        this.nameAirline = nameAirline;
        this.description = description;
        this.codeAirline = codeAirline;
    }
}

