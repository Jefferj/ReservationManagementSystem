package org.example.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int id;

    @Column(name = "reservation_code")
    private String code;

    @Column(name = "flight_code")
    private String flightCode;

    @Column(name = "reservation_date")
    private LocalDateTime reservationDate;

    @Column(name = "seat_number")
    private int seatNumber;

    @Column(name = "passenger_first_name")
    private String passengerFirstName;

    @Column(name = "passenger_last_name")
    private String passengerLastName;

    @Column(name = "reservation_state")
    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity client;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private FlightEntity flight;

    public ReservationEntity(String code, String flightCode, LocalDateTime reservationDate, int seatNumber, String passengerFirstName, String passengerLastName, String state, UserEntity client, FlightEntity flight) {
        this.code = code;
        this.flightCode = flightCode;
        this.reservationDate = reservationDate;
        this.seatNumber = seatNumber;
        this.passengerFirstName = passengerFirstName;
        this.passengerLastName = passengerLastName;
        this.state = state;
        this.client = client;
        this.flight = flight;
    }
}
