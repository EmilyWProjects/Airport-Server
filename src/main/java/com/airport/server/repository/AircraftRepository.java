package com.airport.server.repository;

import com.airport.server.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
    List<Aircraft> findByAirportsId(Long airportId); // Derived query to get aircraft associated with an airport
}
