package com.airport.server.service;

import com.airport.server.model.Aircraft;
import com.airport.server.repository.AircraftRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AircraftService {

    private final AircraftRepository aircraftRepository;

    public List<Aircraft> getAllAircraft() {
        return aircraftRepository.findAll();
    }

    public List<Aircraft> getAircraftByAirportId(Long airportId) {
        return aircraftRepository.findByAirportsId(airportId);
    }

    public Aircraft saveAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    public void deleteAircraft(Long id) {
        aircraftRepository.deleteById(id);
    }
}

