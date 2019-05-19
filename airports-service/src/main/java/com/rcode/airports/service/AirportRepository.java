package com.rcode.airports.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AirportRepository extends PagingAndSortingRepository<Airport, Integer> {

    Stream<Airport> readAllByCountryIsNotNull();

    Stream<Airport> readAllByCountryContains(final String text);
}
