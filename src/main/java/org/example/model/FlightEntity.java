package org.example.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
public class FlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private int id;

    @Column(name = "flight_code")
    private String code;

    @Column(name = "flight_origin")
    private String origin;

    @Column(name = "flight_destination")
    private String destination;

    @Column(name = "departure_date")
    private LocalDateTime departureDate;

    @Column(name = "arrival_date")
    private LocalDateTime arrivalDate;

    @Column(name = "flight_price")
    private double price;

    @Column(name = "available_seats")
    private int availableSeats;

    @ManyToOne
    @JoinColumn(name = "flight_type_id")
    private FlightTypeEntity type;

    @ManyToOne
    @JoinColumn(name = "airline_id")
    private AirlineEntity airline;

    public FlightEntity(String code, String origin, String destination, LocalDateTime departureDate, LocalDateTime arrivalDate, double price, int availableSeats, FlightTypeEntity type, AirlineEntity airline) {
        this.code = code;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.price = price;
        this.availableSeats = availableSeats;
        this.type = type;
        this.airline = airline;
    }
}

