package com.rcode.airports.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
