package com.airport.server.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String airlineName;
    private int numberOfPassengers;

    @ManyToMany
    @JoinTable(
        name = "aircraft_airport",
        joinColumns = @JoinColumn(name = "aircraft_id"),
        inverseJoinColumns = @JoinColumn(name = "airport_id")
    )
    private List<Airport> airports;

    @ManyToMany(mappedBy = "aircraft")
    private List<Passenger> passengers;
}


