package com.rcode.airports.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends PagingAndSortingRepository<Airport, Integer> {
}
