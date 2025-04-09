package com.airport.server.controller;

import com.airport.server.model.Passenger;
import com.airport.server.service.PassengerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping("/aircraft/{aircraftId}")
    public List<Passenger> getPassengersByAircraftId(@PathVariable Long aircraftId) {
        return passengerService.getPassengersByAircraftId(aircraftId);
    }

    @GetMapping("/airport/{airportId}")
    public List<Passenger> getPassengersByAirportId(@PathVariable Long airportId) {
        return passengerService.getPassengersByAirportId(airportId);
    }

    @GetMapping("/city/{cityId}")
    public List<Passenger> getPassengersByCityId(@PathVariable Long cityId) {
        return passengerService.getPassengersByCityId(cityId);
    }

    @PostMapping
    public ResponseEntity<Passenger> createPassenger(@RequestBody Passenger passenger) {
        Passenger savedPassenger = passengerService.savePassenger(passenger);
        return ResponseEntity.ok(savedPassenger);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePassenger(@PathVariable Long id) {
        passengerService.deletePassenger(id);
        return ResponseEntity.noContent().build();
    }
}
