package com.airport.server.service;

import com.airport.server.model.Passenger;
import com.airport.server.repository.PassengerRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public List<Passenger> getPassengersByAircraftId(Long aircraftId) {
        return passengerRepository.findByAircraftsId(aircraftId);
    }

    public List<Passenger> getPassengersByAirportId(Long airportId) {
        return passengerRepository.findByAircraftsAirportsId(airportId);
    }

    public List<Passenger> getPassengersByCityId(Long cityId) {
        return passengerRepository.findByCityId(cityId);
    }

    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}

