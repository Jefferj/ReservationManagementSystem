package org.example.model;
import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "stopovers")
public class StopoverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stopover_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private FlightEntity flight;

    @Column(name = "airport_layover")
    private String airportLayover;

    @Column(name = "arrival_time")
    private Time arrivalTime;

    @Column(name = "departure_time")
    private Time departureTime;

    public StopoverEntity(int id, FlightEntity flight, String airportLayover, Time arrivalTime, Time departureTime) {
        this.id = id;
        this.flight = flight;
        this.airportLayover = airportLayover;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
}
