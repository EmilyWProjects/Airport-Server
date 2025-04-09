package com.airport.server.repository;

import com.airport.server.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
    List<Airport> findAirportsByCityId(Long cityId); // Derived query to fetch airports for a specific city
}

