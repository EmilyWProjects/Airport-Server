package com.airport.server.controller;

import com.airport.server.model.Aircraft;
import com.airport.server.service.AircraftService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aircraft")
public class AircraftController {

    private final AircraftService aircraftService;

    public AircraftController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    @GetMapping
    public List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }

    @GetMapping("/airport/{airportId}")
    public List<Aircraft> getAircraftByAirportId(@PathVariable Long airportId) {
        return aircraftService.getAircraftByAirportId(airportId);
    }

    @PostMapping
    public ResponseEntity<Aircraft> createAircraft(@RequestBody Aircraft aircraft) {
        Aircraft savedAircraft = aircraftService.saveAircraft(aircraft);
        return ResponseEntity.ok(savedAircraft);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAircraft(@PathVariable Long id) {
        aircraftService.deleteAircraft(id);
        return ResponseEntity.noContent().build();
    }
}

