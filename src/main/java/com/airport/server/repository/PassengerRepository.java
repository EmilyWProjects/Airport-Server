package com.airport.server.repository;

import com.airport.server.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    List<Passenger> findByAircraftsId(Long aircraftId); 
    List<Passenger> findByAircraftsAirportsId(Long airportId); 
    List<Passenger> findByCityId(Long cityId); 
}
