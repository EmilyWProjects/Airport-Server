package com.airport.server.service;

import com.airport.server.model.Airport;
import com.airport.server.repository.AirportRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirportService {

    private final AirportRepository airportRepository;

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public List<Airport> getAirportsByCityId(Long cityId) {
        return airportRepository.findAirportsByCityId(cityId);
    }

    public Airport saveAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }
}

