package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "flights_type")
public class FlightTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_type_id")
    private int id;

    @Column(name = "type_name")
    private String nameType;

    @Column(name = "flight_description")
    private String descriptionFlight;

    public FlightTypeEntity(String nameType, String descriptionFlight) {
        this.nameType = nameType;
        this.descriptionFlight = descriptionFlight;
    }
}

