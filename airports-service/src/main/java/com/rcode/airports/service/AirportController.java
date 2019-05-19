package com.rcode.airports.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("airports")
public class AirportController {

    @Autowired
    private AirportRepository repository;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Airport get(@PathVariable final Integer id) {
        return repository.findById(id).get();
    }

    @GetMapping(value = "", produces = "application/json")
    public Iterable<Airport> all() {
        return repository.findAll();
    }

    @GetMapping(value = "/by/country", produces = "application/json")
    @Transactional
    public Map<String, List<Airport>> byCountry() {
        try (final Stream<Airport> airtportStream = repository.readAllByCountryIsNotNull()) {
            return airtportStream.collect(Collectors.groupingBy(Airport::getCountry));
        }
    }

    @GetMapping(value = "/by/country/{text}", produces = "application/json")
    @Transactional
    public Map<String, List<Airport>> byCountry(@PathVariable final String text) {
        try (final Stream<Airport> airportStream = repository.readAllByCountryContains(text)) {
            return airportStream.collect(Collectors.groupingBy(Airport::getCountry));
        }
    }
}
