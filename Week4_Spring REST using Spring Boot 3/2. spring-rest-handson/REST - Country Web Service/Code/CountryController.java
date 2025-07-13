package com.example.countryrest.controller;

import com.example.countryrest.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CountryController {

    // Sample list of countries
    private List<Country> countryList = new ArrayList<>();

    // Constructor: preload some countries
    public CountryController() {
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("FR", "France"));
        countryList.add(new Country("JP", "Japan"));
    }

    // GET /countries → return all countries
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryList;
    }

    // GET /countries/{code} → return one country by code
    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
